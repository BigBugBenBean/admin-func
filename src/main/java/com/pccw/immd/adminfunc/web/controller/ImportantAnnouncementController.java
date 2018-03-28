package com.pccw.immd.adminfunc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/e-Services-2/maintenance")
public class ImportantAnnouncementController {

    /**
     * Main
     */
    @GetMapping(value = "/importantAnnouncement.do")
    public String importAnntPage() {
        return "/eServices2/ImportantAnnouncement/important-announcement-main";
    }

    /**
     * Edit Free Text Template
     */

    @GetMapping(value = "/importantAnnouncement_FreeTextSelect.do")
    public String importAnntFreeTextSelectPage() {
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-select";
    }

    @GetMapping(value = "/importantAnnouncement_FreeTextEdit.do")
    public String importAnntFreeTextEditPage() {
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-edit";
    }

    @GetMapping(value = "/importantAnnouncement_FreeTextEditSuccess.do")
    public String importAnntFreeTextEditSuccessPage() {
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-edit-success";
    }

    /**
     * Create System Maintenance Announcement
     */

    @GetMapping(value = "/importantAnnouncement_SystemMaintenanceCreate.do")
    public String importAnntSysMainCreatePage() {
        return "/eServices2/ImportantAnnouncement/important-announcement-system-maintenance-create";
    }

    @GetMapping(value = "/importantAnnouncement_SystemMaintenanceCreateSuccess.do")
    public String importAnntSysMainCreateSuccessPage() {
        return "/eServices2/ImportantAnnouncement/important-announcement-system-maintenance-create-success";
    }

    /**
     * Create Free Text Announcement
     */

    @GetMapping(value = "/importantAnnouncement_FreeTextCreate.do")
    public String importAnntFreeTextCreatePage() {
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-create";
    }

    @GetMapping(value = "/importantAnnouncement_FreeTextCreateSuccess.do")
    public String importAnntFreeTextCreateSuccessPage() {
        return "/eServices2/ImportantAnnouncement/important-announcement-free-text-create-success";
    }

}
