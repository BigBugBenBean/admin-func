package com.pccw.immd.adminfunc.web.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * Created by Dell on 18/4/2018.
 */

@Service("webAuthorizationService.eservice2")
public class WebAuthorizationServiceImpl implements WebAuthorizationService {
    @Override
    public boolean hasAuthorized() {
        if (SecurityContextHolder.getContext() != null
                && SecurityContextHolder.getContext().getAuthentication() != null) {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if (!(principal instanceof String && ((String) principal).equals("anonymousUser"))) {
                return true;
            }
        }
        return false;
    }
}
