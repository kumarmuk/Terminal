package com.nyota.sample.terminals;

import java.time.LocalDateTime;

public class Terminal implements TerminalConfiguration{
	
	private String id;
	private double latitude;
	private double longitude;
	private boolean status;
	private int cores;
	private long rMemory;
	private long pStorage;
	@Override
	public boolean connectToServer() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean getServerConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean setServerConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean uploadStatusReport() {
		// TODO Auto-generated method stub
		return false;
	}
		
}

