package com.wbrandon.utillib.type;

public interface Type<T extends Type<T>>
{
	
	public T copy();
	
}
