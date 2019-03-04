package com.wbrandon.utillib.type.color;

import com.wbrandon.utillib.type.Type;

public class RGBColor implements Type<RGBColor>
{
	
	public static final RGBColor BLACK = new RGBColor(0F, 0F, 0F);
	public static final RGBColor WHITE = new RGBColor(1F, 1F, 1F);
	public static final RGBColor RED = new RGBColor(1F, 0F, 0F);
	public static final RGBColor GREEN = new RGBColor(0F, 1F, 0F);
	public static final RGBColor BLUE = new RGBColor(0F, 0F, 1F);
	public static final RGBColor YELLOW = new RGBColor(1F, 1F, 0F);
	public static final RGBColor TEAL = new RGBColor(0F, 1F, 1F);
	public static final RGBColor MAGENTA = new RGBColor(1F, 0F, 1F);
	
	private float redValue, greenValue, blueValue;
	
	public RGBColor(float redValue, float greenValue, float blueValue)
	{
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}
	
	public float getRedValue() { return redValue; }

	public float getGreenValue() { return greenValue; }

	public float getBlueValue() { return blueValue; }
	
	public RGBAColor toRGBAColor()
	{
		return new RGBAColor(redValue, greenValue, blueValue, 1F);
	}

	@Override
	public RGBColor copy()
	{
		return new RGBColor(redValue, greenValue, blueValue);
	}
	
}
