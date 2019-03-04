package com.wbrandon.utillib.type;

public class Provider<T extends Type<T>>
{
	
	private T source;
	
	public Provider(T source)
	{
		this.source = source;
	}
	
	public T provide()
	{
		return source.copy();
	}
	
	public T getSource() { return source; }
	public void setSource(T source) { this.source = source; }
	
}
