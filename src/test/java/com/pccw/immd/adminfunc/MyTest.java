package com.pccw.immd.adminfunc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.InputMismatchException;

public class MyTest {
    private final static Logger LOOGER = LoggerFactory.getLogger(MyTest.class);

    @Test
    public void Test() {
        Integer i = 1;
        Object input = i;
        showPremitive(input);//check for every input
    }
    public static void showPremitive(Object input){
        try{
            if (input instanceof Short)
                LOOGER.info("Primitive : short");
            else if(input instanceof Integer)
                LOOGER.info("Primitive : int");
            else if(input instanceof Long)
                LOOGER.info("Primitive : long");
            else if(input instanceof Float)
                LOOGER.info("Primitive : float");
            else if(input instanceof Double)
                LOOGER.info("Primitive : double");
            else if(input instanceof Boolean)
                LOOGER.info("Primitive : bool");
            else if(input instanceof Character)
                LOOGER.info("Primitive : char");
            else if(input instanceof Byte)
                LOOGER.info("Primitive : byte");
            else
                LOOGER.info("Reference : string");
        }
        catch (InputMismatchException e){
            LOOGER.info("Exception occur = "+e);
        }
    }

}