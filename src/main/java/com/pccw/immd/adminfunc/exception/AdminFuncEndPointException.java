package com.pccw.immd.adminfunc.exception;

import com.pccw.immd.commons.errors.BusinessLogicException;

/**
 * Created by vagrant on 6/14/17.
 */
public class AdminFuncEndPointException extends BusinessLogicException {
    public AdminFuncEndPointException(String message) {
        super(message);
    }
}
