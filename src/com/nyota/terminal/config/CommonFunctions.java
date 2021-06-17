package com.nyota.terminal.config;

@FunctionalInterface
interface PingServer {
	boolean ping (String host, int timeInMilliSeconds);
}

@FunctionalInterface
interface NoParameters {
	void print();
}

@FunctionalInterface
interface OneParameter {
	void print (String s);
}
