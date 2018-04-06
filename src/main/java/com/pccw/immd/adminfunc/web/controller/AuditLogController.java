package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.AuditLogResult;
import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.dto.AuditLogDTO;
import com.pccw.immd.adminfunc.dto.FuncDTO;
import com.pccw.immd.adminfunc.service.AuditLogService;
import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
@RequestMapping(value = "/e-Services-2/maintenance")
public class AuditLogController {

    private static final Logger LOG = LoggerFactory.getLogger(AuditLogController.class);

    @Autowired
    @Qualifier("auditLogService.eservice2")
    private AuditLogService auditLogService;

    @GetMapping(value = "/auditLog.do")
    public String auditLogSearchForm(HttpServletRequest request, @ModelAttribute FuncDTO funcDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Audit_Log);

        List<Func> list = auditLogService.listFunctionList();

        if (list.size() > 0) {
            funcDTO.setFuncList(list);
        }


        return "/eServices2/AuditLog/audit-log-search";
    }

    @PostMapping(value = "/auditLog_Result.do")
    public String auditLogSearch(HttpServletRequest request, @ModelAttribute AuditLogDTO auditLogDTO) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Audit_Log);

        // dummy data
//        String funcId = "AFE001";
//        String userId = "";

//        String startTime = "01/03/2018";
//        Integer startHour = 10;
//        Integer startMinute = 40;
//        String endTime = "01/03/2018";
//        Integer endHour = 15;
//        Integer endMinute = 45;

//        auditLogDTO.setFuncId(funcId);
//        auditLogDTO.setUserId(userId);
//        auditLogDTO.setStartTime(startTime);
//        auditLogDTO.setStartHour(startHour);
//        auditLogDTO.setStartMinute(startMinute);
//        auditLogDTO.setEndTime(endTime);
//        auditLogDTO.setEndHour(endHour);
//        auditLogDTO.setEndMinute(endMinute);


//
        String dateRegex = "\\d{2}/\\d{2}/\\d{4}\\d{2}\\d{2}";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyyHHmm");


        // startDate
        if (!auditLogDTO.getStartTime().equals("")
                && auditLogDTO.getStartHour() != null
                && auditLogDTO.getStartMinute() != null
                ) {
            //
            String tmpStartHour = String.format("%02d", auditLogDTO.getStartHour());
            String tmpStartMinute = String.format("%02d", auditLogDTO.getStartMinute());

            //
            String startDateStr = auditLogDTO.getStartTime() + tmpStartHour + tmpStartMinute;

            if (!startDateStr.equals("")) {
                if (auditLogDTO.getStartHour() < 0 || auditLogDTO.getStartHour() >= 24) {
                    // TODO: exception case
                    LOG.debug("InvalidStartHour");
                }
                if (auditLogDTO.getStartMinute() < 0 || auditLogDTO.getStartMinute() >= 60) {
                    // TODO: exception case
                    LOG.debug("InvalidStartMinute");
                }

                Boolean isValidStartDate = startDateStr.matches(dateRegex);
                if (!isValidStartDate) {
                    // TODO: exception case
                    LOG.debug("InvalidStartDate");
                }

                try {
                    Date startDate = dateFormat.parse(startDateStr);
                    Long startLong = startDate.getTime();
                    auditLogDTO.setStartDate(startDate);
                } catch (Exception e) {
                    // TODO: exception case
                    LOG.debug("ERROR: Date parse error");
                }
            }
        }


        // endDate
        if (!auditLogDTO.getEndTime().equals("")
                && auditLogDTO.getEndHour() != null
                && auditLogDTO.getEndMinute() != null
                ) {
            //
            String tmpEndHour = String.format("%02d", auditLogDTO.getEndHour());
            String tmpEndMinute = String.format("%02d", auditLogDTO.getEndMinute());

            //
            String endDateStr = auditLogDTO.getEndTime() + tmpEndHour + tmpEndMinute;

            if (!endDateStr.equals("")) {
                if (auditLogDTO.getEndHour() < 0 || auditLogDTO.getEndHour() >= 24) {
                    // TODO: exception case
                    LOG.debug("InvalidEndHour");
                }
                if (auditLogDTO.getEndMinute() < 0 || auditLogDTO.getEndMinute() >= 60) {
                    // TODO: exception case
                    LOG.debug("InvalidEndMinute");
                }

                Boolean isValidEndDate = endDateStr.matches(dateRegex);
                if (!isValidEndDate) {
                    // TODO: exception case
                    LOG.debug("InvalidEndDate");
                }

                try {
                    Date endDate = dateFormat.parse(endDateStr);
                    Long endLong = endDate.getTime();
                    auditLogDTO.setEndDate(endDate);
                } catch (Exception e) {
                    // TODO: exception case
                    LOG.debug("ERROR: Date parse error");
                }
            }
        }





        List<AuditLogResult> list = auditLogService.searchAuditLogList(auditLogDTO);

        if (list.size() > 0) {
            auditLogDTO.setAuditLogResultList(list);
        }

        LOG.debug("");


        return "/eServices2/AuditLog/audit-log-result";
    }
}
