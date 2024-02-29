package com.example.SpringLoggers.Controller;

import java.io.File;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Controller
{
    //initializing logger object for current class
    private static final Logger logger=Logger.getLogger(Controller.class);
    public static void main(String[] args) {
        //if we use basic configation the we use Basic configaration method
       // BasicConfigurator.configure();

        //If we are use PropertyConfigaration then we will go PropertyConfigaration method
        System.out.println(System.getProperty("user.dir"));
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/main/resources" + File.separator+"application.properties");
        logger.info("This is info data");
        logger.debug("This is debug data");
        logger.warn("This is warn data");
        logger.error("This is error data");
        logger.trace("This is trace data");
        logger.fatal("This is fatal data");


    }
}
