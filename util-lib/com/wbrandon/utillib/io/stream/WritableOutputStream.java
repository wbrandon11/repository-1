package com.wbrandon.utillib.io.stream;

import java.io.IOException;
import java.io.OutputStream;

public abstract class WritableOutputStream extends OutputStream
{

	@Override
	public void write(int characterUnicodeId) throws IOException
	{
		byte[] byteBuffer = new byte[1];
		byteBuffer[0] = (byte)characterUnicodeId;
		String characterString = new String(byteBuffer, 0, 1);
		char character = characterString.charAt(0);
		write(character);
	}
	
	public abstract void write(char character);
	
}
