package com.nyota.sample.terminals;

import java.time.LocalDateTime;

/**
 * This is the report that will be produced by each terminal
 * 
 * @author mukul
 *
 */
public class TerminalReport {

	private String terminalId;
	private long reportTime;
	private String swVersion = "ST83902";
	private String status = "UP";
	private int threadCount = 1;
	private float coreTemp = 30.7F;
	private float totalMemory = 1024;
	private float memAvailable = 512;
	private float spaceAllocated = 128000;
	private float spaceAvailable = 36000;
	private int connectedUsers = 8;
}
