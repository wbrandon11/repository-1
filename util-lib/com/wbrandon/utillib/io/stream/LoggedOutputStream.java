package com.wbrandon.utillib.io.stream;

public class LoggedOutputStream extends WritableOutputStream
{
	
	private StringBuffer stringBuffer;

	public LoggedOutputStream()
	{
		stringBuffer = new StringBuffer();
	}
	
	@Override
	public void write(char character)
	{
		stringBuffer.append(character);
	}
	
	public String getLoggedOutput() { return stringBuffer.toString(); }
	
	@Override
	public String toString()
	{
		return getLoggedOutput();
	}
}
