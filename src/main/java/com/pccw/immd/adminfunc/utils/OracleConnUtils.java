package com.pccw.immd.adminfunc.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleConnUtils {

    private static Logger logger = LoggerFactory.getLogger(OracleConnUtils.class);



    //Report Connection
    public static Connection getReportDBConnection()
            throws ClassNotFoundException, SQLException {

        Connection con=null;
        String dbURL=null;
        String userName=null;
        String password=null;
        String jndiPath=null;
        Properties prop=null;
        String dbConnectionType="";


        prop=JobUtils.getProperties();
        dbConnectionType=prop.getProperty("dbConnectionType");





        if(null!=dbConnectionType) {
            if("JDBC".equals(dbConnectionType)) {
                dbURL= prop.getProperty("dbURL");
                userName = prop.getProperty("dbUsername");
                password = prop.getProperty("dbPassword");
                con=getOracleConnection(dbURL, userName, password);
            }else if("JNDI".equals(dbConnectionType)){
                jndiPath=prop.getProperty("dbJNDIPath");
                con=getJNDIConnection(jndiPath);
            }

        }


        return con;
    }





    public static Connection getJNDIConnection(String jndiPath){
//    	String DATASOURCE_CONTEXT = "java:/JNDIDS";

        Connection result = null;
        try {
            Context initialContext = new InitialContext();

            if ( initialContext == null){
                System.out.println("JNDI problem. Cannot get InitialContext.");
            }

            DataSource datasource = (DataSource)initialContext.lookup(jndiPath);
            if (datasource != null) {
                result = datasource.getConnection();
            }else {
                System.out.println("Failed to lookup datasource.");
            }
        }catch ( NamingException ex ) {
            System.out.println("Cannot get connection: " + ex);
        }
        catch(SQLException ex){
            System.out.println("Cannot get connection: " + ex);
        }

        return result;
    }




    //Use this Final for one dbURL
    public static Connection getOracleConnection(String dbURL, String userName, String password)
            throws ClassNotFoundException,SQLException {


        // Declare the class Driver for ORACLE DB
        // This is necessary with Java 5 (or older)
        // Java6 (or newer) automatically find the appropriate driver.
        // If you use Java> 5, then this line is not needed.
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection(dbURL, userName,password);
        return conn;
    }











    public static Connection getOracleConnection(String hostName, String sid,
                                                 String userName, String password) throws ClassNotFoundException,
            SQLException {


        // Declare the class Driver for ORACLE DB
        // This is necessary with Java 5 (or older)
        // Java6 (or newer) automatically find the appropriate driver.
        // If you use Java> 5, then this line is not needed.
        Class.forName("oracle.jdbc.driver.OracleDriver");


        // Example: jdbc:oracle:thin:@localhost:1521:db11g
//        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521/" + sid;
        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521/" + sid;


        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }





}
