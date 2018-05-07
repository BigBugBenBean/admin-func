package com.immd.eservice2.job.report;

import com.pccw.immd.adminfunc.utils.JobUtils;
import com.pccw.immd.adminfunc.utils.OracleConnUtils;
import net.sf.jasperreports.engine.JRException;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class EC_ROP_201_01 implements Job {

    private static Logger logger = LoggerFactory.getLogger("report");

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String jasperFileName = "EC-ROP-201-01";
        String pdfFileName = jasperFileName;
        String jobName = "Report-" + pdfFileName;
        logger.info("Report Job " + jobName
                + " Start====================================================================== ");

        try {
            Map mergeJobDataMap = context.getMergedJobDataMap();
            logger.debug("mergeJobDataMap reportDate: " + mergeJobDataMap.get("reportDate"));

            HashMap jasperParameterMap = JobUtils.getJasperParameterMap();
            jasperParameterMap.put("app_date", JobUtils.getReportDate((String) mergeJobDataMap.get("reportDate"),
                    "daily", context.getFireTime(), -1, "start"));

            Connection con = OracleConnUtils.getReportDBConnection();
            JobUtils.genReport(jasperFileName, pdfFileName, jasperParameterMap, con);
            context.setResult("SUCCESS");

            logger.info("Gen Report SUCCESS------------------------------");
        } catch (JRException e) {
            logger.debug("JRException: " + e.toString());
            context.setResult("FAILED");
        } catch (ClassNotFoundException e) {
            logger.debug("ClassNotFoundException: " + e.toString());
            context.setResult("FAILED");
        } catch (SQLException e) {
            logger.debug("SQLException: " + e.toString());
            context.setResult("FAILED");
        } catch (Exception e) {
            logger.debug("Exception: " + e.toString());
            context.setResult("FAILED");
        }

        logger.info("Report Job " + jobName
                + " End====================================================================== ");
    }

}
