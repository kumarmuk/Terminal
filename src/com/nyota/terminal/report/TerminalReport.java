package com.nyota.terminal.report;

import com.nyota.terminal.config.TerminalConfig;
import javax.Json.JsonObject;

/**
 * This is the report that will be uploaded to the server
 */
public class TerminalReport {

    private static String serialNumber = TerminalConfig.getSerialNumber();
    private static String terminalModel;
    private static String softwareVersion;
    private static double latitude;
    private static double longitude; 


    private boolean createTeminalReport () {

        JsonObject obj = Json.createObjectBuilder()
        return false;
    }





    
}
