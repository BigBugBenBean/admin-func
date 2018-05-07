package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor.FUNC_ID_KEY;

@Controller
@RequestMapping(value = "/e-Services-2/maintenance")
public class ImportantAnnouncementController {

    /**
     * Main
     */
    @GetMapping(value = "/importantAnnouncement.do")
    public String importAnntPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Important_Announcement);
        return "/eServices2/ImportantAnnouncement/important-announcement-main";
    }

    /**
     * Edit Free Text Template
     */

    @GetMapping(value = "/importantAnnouncement_FreeTextSelect.do")
    public String importAnntFreeTextSelectPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Important_Announcement);
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-select";
    }

    @GetMapping(value = "/importantAnnouncement_FreeTextEdit.do")
    public String importAnntFreeTextEditPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Important_Announcement);
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-edit";
    }

    @GetMapping(value = "/importantAnnouncement_FreeTextEditSuccess.do")
    public String importAnntFreeTextEditSuccessPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Important_Announcement);
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-edit-success";
    }

    /**
     * Create System Maintenance Announcement
     */

    @GetMapping(value = "/importantAnnouncement_SystemMaintenanceCreate.do")
    public String importAnntSysMainCreatePage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Important_Announcement);
        return "/eServices2/ImportantAnnouncement/important-announcement-system-maintenance-create";
    }

    @GetMapping(value = "/importantAnnouncement_SystemMaintenanceCreateSuccess.do")
    public String importAnntSysMainCreateSuccessPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Important_Announcement);
        return "/eServices2/ImportantAnnouncement/important-announcement-system-maintenance-create-success";
    }

    /**
     * Create Free Text Announcement
     */

    @GetMapping(value = "/importantAnnouncement_FreeTextCreate.do")
    public String importAnntFreeTextCreatePage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Important_Announcement);
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-create";
    }

    @GetMapping(value = "/importantAnnouncement_FreeTextCreateSuccess.do")
    public String importAnntFreeTextCreateSuccessPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Important_Announcement);
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-create-success";
    }

    @GetMapping(value = "/importantAnnouncement_FreeTextDetail.do")
    public String importAnntFreeTextDetailPage(HttpServletRequest request) {
        request.setAttribute(FUNC_ID_KEY, BreadcrumbInterceptor.FUNC_ID.Important_Announcement);
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-detail";
    }

}
