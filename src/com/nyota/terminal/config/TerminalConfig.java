package com.nyota.terminal.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.nyota.sample.terminals.TerminalConfiguration;

/**
 * This class will read the terminal config properties from the terminal.config file
 */
public class TerminalConfig {
    
    private static String serialNumber;
    private static String terminalModel;
    private static String softwareVersion;
    private static final String fileLocation = "terminal.config";
    private static Properties terminalProperties = new Properties();

static  {
    FileInputStream fis;
    try {
        fis = new FileInputStream(fileLocation);
        terminalProperties.load(fis);
        loadProperties();
    } catch (FileNotFoundException e) {
        System.out.println ("The properties file terminal.config could not be found in the application root");
    } catch (IOException e) {
        System.out.println ("IO error while reading the terminal.config file");
    }
}


    public TerminalConfig () {
   
    }
    
    public static void loadProperties () {
        serialNumber = terminalProperties.getProperty("terminal.serial.number");
        terminalModel = terminalProperties.getProperty("terminal.model");
        softwareVersion = terminalProperties.getProperty("terminal.software.version");
    }

    public static String getSerialNumber() {
        return serialNumber;
    }

    public static String getTerminalModel() {
        return terminalModel;
    }

    public static String getSoftwareVersion() {
        return softwareVersion;
    }


}
