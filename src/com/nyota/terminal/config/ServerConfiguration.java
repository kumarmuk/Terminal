package com.nyota.terminal.config;

import java.io.IOException;
import java.net.MalformedURLException;

public interface ServerConfiguration {

	public String getServerConnectionURL();

	public void setServerConnectionURL(String serverConnectionURL);
	
	public boolean pingServerConnectionURL () throws MalformedURLException, IOException; 

	
	
}