package com.pccw.immd.adminfunc.web.security;

import ws.upms.immd.v1.ITIAppException;

/**
 * Created by Dell on 26/2/2018.
 */
public class ExceptionUtils {

    public static util.itifwk.immd.v1.ITIAppException getUmpsException(Object exception) {
        if (exception !=null && exception instanceof Exception  ){
            Exception ex = (Exception) exception;
            if (ex.getCause() instanceof ITIAppException){
                ITIAppException appEx = (ITIAppException)ex.getCause();
                return appEx.getFaultInfo();
            }
        }
        return null;
    }

}