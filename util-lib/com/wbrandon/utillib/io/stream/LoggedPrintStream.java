package com.wbrandon.utillib.io.stream;

import java.io.PrintStream;

public class LoggedPrintStream extends PrintStream
{

	public LoggedPrintStream()
	{
		super(new LoggedOutputStream());
	}
	
	public String getLoggedOutput() { return out.toString(); }
	
	@Override
	public String toString()
	{
		return getLoggedOutput();
	}

}
