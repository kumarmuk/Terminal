package com.nyota.terminal.config;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import com.nyota.terminal.config.NoParameters;

public abstract class AbstractServerConfiguration implements ServerConfiguration {

	private String serverConnectionURL;

	public String getServerConnectionURL() {
		return serverConnectionURL;
	}

	public void setServerConnectionURL(String serverConnectionURL) {
		this.serverConnectionURL = serverConnectionURL;
	}

	@Override
	public boolean pingServerConnectionURL() throws IOException {
		URL connectionUrl = new URL(this.serverConnectionURL);
		URLConnection connection = connectionUrl.openConnection();
		connection.setConnectTimeout(10);
		connection.connect();

		PingServer pingServer = (hostname, timeInMilliseconds) -> {
			// there needs to be some implementation code here that will implement the ping
			// method
			System.out.println("Will ping the server " + hostname + " for a time period of " + timeInMilliseconds);
			return false;
		};

		OneParameter oneParameter = (str1) -> System.out.println("hello world" + str1);

		NoParameters noParameters = () -> System.out.println("hello world");

		pingServer.ping("192.168.48.2", 20);
		oneParameter.print("hola");
		noParameters.print();

		return true;
	}

	public static void main(String[] args) {
		PingServer pingServer = (hostname, timeInMilliseconds) -> {
			// there needs to be some implementation code here that will implement the ping
			// method
			System.out.println("Will ping the server " + hostname + " for a time period of " + timeInMilliseconds);
			return false;
		};

		OneParameter oneParameter = (str1) -> System.out.println("hello world " + str1);

		NoParameters noParameters = () -> System.out.println("hello world");

		pingServer.ping("192.168.48.2", 20);
		oneParameter.print("hola");
		noParameters.print();

		
		SayHello sayHello = new SayHello () {
			
			public void hello () {
				System.out.println ("Saying hello to the world");
			}
			
		};
		
	}
}

interface SayHello {
	public void hello ();
}

