package com.nyota.terminal.config;

import java.io.IOException;

public class TestMain {

	public static void main(String[] args) {
		SchoolManagementServer sc1 = new SchoolManagementServer();
		ContentManagementServer sc2 = new ContentManagementServer();

		sc1.setServerConnectionURL("http://192.168.34.3/schoolmgmt");
		sc2.setServerConnectionURL("http://192.168.34.3/contentmgmt");

		System.out.println(sc1.getServerConnectionURL());
		System.out.println(sc2.getServerConnectionURL());
		
		
		
		
		try {
			boolean isConnection = sc1.pingServerConnectionURL();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("There seems to be an issue with the connection");
		
		}
		

	}

}
