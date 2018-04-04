package com.pccw.immd.adminfunc.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class JobUtils {
    private final static Logger LOG = LoggerFactory.getLogger(JobUtils.class);

    public static Properties getProperties() {
        Properties prop = new Properties();
        InputStream input = null;

        try {

            String filename = "reportConfig.properties";
            input =  JobUtils.class.getClassLoader().getResourceAsStream(filename);
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return prop;
    }

    public static Job getClass(String classname) throws Exception
    {
        Class<?> class1 = Class.forName(classname);
        return (Job)class1.newInstance();
    }

    public static JobDataMap getJobDataMap(String json){
//		JobDataMap jobDataMap=null;
        JobDataMap jobDataMap=new JobDataMap();


        Map<String, String> map = new HashMap<String, String>();
        ObjectMapper mapper = new ObjectMapper();

        try {
            map = mapper.readValue(json, new TypeReference<HashMap<String, String>>() {});
            jobDataMap=new JobDataMap(map);
        } catch (Exception e) {
            LOG.debug("Exception: "+e.toString());
        }

        return jobDataMap;
    }


    public static JasperReport genReport(String jasperFileName, String pdfFileName, HashMap jasperParameterMap,
                                         Connection con) throws Exception {
        LOG.info("Method genReport Final: Start=====================================================");
        Properties properties = JobUtils.getProperties();
        String inputPath = null;
        String outputPath = null;
        JasperReport jasperReport1 = null;

        inputPath = properties.getProperty("inputPath");
        outputPath = properties.getProperty("outputPath");

        File jasperFile = new File(inputPath + jasperFileName + ".jasper");

        if (!jasperFile.exists()) {
            LOG.debug("jasperFile NOT EXIST!");
            throw new FileNotFoundException(String.valueOf(jasperFile));
        } else {
            LOG.debug("jasperFile EXIST.");
        }
        LOG.info("Method genReport: Created File Complete");

        if (jasperFile.exists()) {
            jasperReport1 = (JasperReport) JRLoader.loadObject(jasperFile);

            if (null != con) {
                LOG.debug("Connection is NOT NULL.");
                LOG.info("Method genReport: Get Report DB Connection Complete");
            } else {
                LOG.debug("Connection is NULL!");
            }
            LOG.info("Method genReport: JR Load Object Complete");

            LOG.debug("jasperParameterMap SUBREPORT_DIR: " + jasperParameterMap.get("SUBREPORT_DIR"));
            LOG.debug("jasperParameterMap app_date: " + jasperParameterMap.get("app_date"));
            LOG.debug("jasperParameterMap apm_date: " + jasperParameterMap.get("apm_date"));
            LOG.debug("jasperParameterMap rpt_date: " + jasperParameterMap.get("rpt_date"));
            LOG.debug("jasperParameterMap office_code: " + jasperParameterMap.get("office_code"));

            JasperPrint jasperPrint1 = JasperFillManager.fillReport(jasperReport1, jasperParameterMap, con);

            con.close();
            LOG.info("Method genReport: Fill Reports Complete");

            DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");

            String nowStr = df.format(new Date());

            JasperExportManager.exportReportToPdfFile(jasperPrint1,
                    outputPath + pdfFileName + " (" + nowStr + ") " + ".pdf");
            LOG.info("Method genReport: Export Report to PDF Complete");
        }

        return jasperReport1;
    }


    // To get init JasperParameterMap
    public static HashMap getJasperParameterMap() {
        String inputPath = null;

        Properties properties = JobUtils.getProperties();
        inputPath = properties.getProperty("inputPath");

        HashMap jasperParameterMap = new HashMap();
        jasperParameterMap.put("SUBREPORT_DIR", inputPath);

        return jasperParameterMap;
    }

    public static String getReportDate(String reportDate, String reportType, Date jobFireTime, int dayAdjust,
                                       String returnDateType) {
        LOG.info(
                "getReportDate Final use this Method----------------------------------------------------------------------------");
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        // Date date=null;
        Date adhocDate = null;
        Date returnDate = null;
        String dateStr = null;

        LOG.debug("reportDate: " + reportDate);
        LOG.debug("reportType: " + reportType);
        LOG.debug("jobFireTime: " + jobFireTime);
        LOG.debug("dayAdjust: " + dayAdjust);

        if (null != reportDate) {
            // reportDate NOT Empty
            if (null != reportDate && "" != reportDate) {
                if ("default".equals(reportDate)) {
                    returnDate = getDate(jobFireTime, reportType, returnDateType);
                } else {
                    try {
                        adhocDate = formatter.parse(reportDate);
                    } catch (ParseException e) {
                        LOG.debug("ParseException: " + e.toString());
                    }

                    if (null != adhocDate) {
                        returnDate = getDate(adhocDate, reportType, returnDateType);
                    }
                }

            } else {
                returnDate = getDate(jobFireTime, reportType, returnDateType);
            }
        }

        LOG.debug("returnDate: " + returnDate);

        if (null != returnDate) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(returnDate);

            if (!"daily".equals(reportType)) {
                dayAdjust = 0;
            }

            LOG.debug("returnDate Original getTime: " + cal.getTime());
            // cal.add(Calendar.DAY_OF_MONTH, dayAdjust);
            cal.add(Calendar.DATE, dayAdjust);
            LOG.debug("returnDate After Adjust getTime: " + cal.getTime());

            // jobFireTime Date without Time
            returnDate = cal.getTime();

            dateStr = formatter.format(returnDate);
        }

        LOG.debug("dateStr: " + dateStr);

        return dateStr;

    }

    public static Date getDate(Date inputDate, String reportType, String returnDateType) {
        LOG.info("getDate Method Start---------------------------------------------");

        Date returnDate = null;

        Calendar cal = Calendar.getInstance();
        cal.setTime(inputDate);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        LOG.debug("inputDate: " + inputDate);
        LOG.debug("cal getTime: " + cal.getTime());

        if (null != reportType) {
            if ("daily".equals(reportType)) {
                returnDate = cal.getTime();
            } else if ("weekly".equals(reportType)) {
                cal.add(Calendar.DATE, -1);
                LOG.debug("cal previous Monday p1: " + cal.getTime());
                cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
                LOG.debug("cal previous Monday p2: " + cal.getTime());

                if ("start".equals(returnDateType)) {
                    cal.add(Calendar.DATE, -7);
                    LOG.debug("weekly start: " + cal.getTime());
                } else if ("end".equals(returnDateType)) {
                    cal.add(Calendar.DATE, -1);
                    LOG.debug("weekly end: " + cal.getTime());
                }
            } else if ("monthly".equals(reportType)) {
                cal.set(Calendar.DAY_OF_MONTH, 1);

                if ("start".equals(returnDateType)) {
                    cal.add(Calendar.MONTH, -1);
                    LOG.debug("monthly start: " + cal.getTime());
                } else if ("end".equals(returnDateType)) {
                    cal.add(Calendar.DATE, -1);
                    LOG.debug("monthly end: " + cal.getTime());
                }
            } else if ("quarterly".equals(reportType)) {
                cal.setTime(inputDate);
                cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) / 3 * 3);
                cal.set(Calendar.DAY_OF_MONTH, 1);

                if ("start".equals(returnDateType)) {
                    cal.add(Calendar.MONTH, -3);
                    LOG.debug("quarterly start: " + cal.getTime());
                } else if ("end".equals(returnDateType)) {
                    cal.add(Calendar.DATE, -1);
                    LOG.debug("quarterly end: " + cal.getTime());
                }
            } else if ("halfyearly".equals(reportType)) {
                cal.setTime(inputDate);
                cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) / 6 * 6);
                cal.set(Calendar.DAY_OF_MONTH, 1);

                if ("start".equals(returnDateType)) {
                    cal.add(Calendar.MONTH, -6);
                    LOG.debug("halfyearly start: " + cal.getTime());
                } else if ("end".equals(returnDateType)) {
                    cal.add(Calendar.DATE, -1);
                    LOG.debug("halfyearly end: " + cal.getTime());
                }
            } else if ("yearly".equals(reportType)) {
                cal.setTime(inputDate);
                cal.set(Calendar.DAY_OF_YEAR, 1);

                if ("start".equals(returnDateType)) {
                    cal.add(Calendar.YEAR, -1);
                    LOG.debug("yearly start: " + cal.getTime());
                } else if ("end".equals(returnDateType)) {
                    cal.add(Calendar.DATE, -1);
                    LOG.debug("yearly end: " + cal.getTime());
                }
            }

            returnDate = cal.getTime();
        }

        LOG.debug("returnDate: " + returnDate);
        LOG.info("getDate Method End---------------------------------------------");

        return returnDate;
    }


    // Get Date without time at 00:00:00
    public static Date getDate(Date inputDate) {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Date date = null;

        try {
            date = formatter.parse(formatter.format(inputDate));
        } catch (ParseException ex) {
            LOG.debug("ParseException: " + ex.toString());
        }

        return date;
    }

    // Get DateString without time at 00:00:00
    public static String getDateStr(Date inputDate) {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        String dateStr = null;

        try {
            date = formatter.parse(formatter.format(inputDate));
        } catch (ParseException ex) {
            LOG.debug("ParseException: " + ex.toString());
        }

        if (null != date) {
            dateStr = formatter.format(date);
        }

        return dateStr;
    }
}
