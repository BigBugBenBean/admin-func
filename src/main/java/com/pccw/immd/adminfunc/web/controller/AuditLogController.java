package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.AuditLog;
import com.pccw.immd.adminfunc.dto.AuditLogDTO;
import com.pccw.immd.adminfunc.service.AuditLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/eservices2/")
public class AuditLogController {

    private static final Logger LOG = LoggerFactory.getLogger(AuditLogController.class);

    @Autowired
    @Qualifier("auditLogService.eservice2")
    private AuditLogService auditLogService;

    @GetMapping(value = "/auditLogSearchForm.do")
    public String auditLogSearchForm(@ModelAttribute AuditLogDTO auditLogDTO) {
        return "/eServices2/AuditLog/audit-log-search-form";
    }

    @PostMapping(value = "/auditLogSearch.do")
    public String auditLogSearch(@ModelAttribute AuditLogDTO auditLogDTO) {
        List<AuditLog> list = auditLogService.listAll(auditLogDTO);

        if (list.size() > 0) {
            auditLogDTO.setAuditLogList(list);
        }

        return "/eServices2/AuditLog/audit-log-search";
    }
}
