package com.wbrandon.utillib.type.color;

import com.wbrandon.utillib.type.Type;

public class RGBAColor implements Type<RGBAColor>
{
	
	public static final RGBAColor CLEAR = new RGBAColor(0F, 0F, 0F, 0F);
	public static final RGBAColor BLACK = new RGBAColor(0F, 0F, 0F, 1F);
	public static final RGBAColor WHITE = new RGBAColor(1F, 1F, 1F, 1F);
	public static final RGBAColor RED = new RGBAColor(1F, 0F, 0F, 1F);
	public static final RGBAColor GREEN = new RGBAColor(0F, 1F, 0F, 1F);
	public static final RGBAColor BLUE = new RGBAColor(0F, 0F, 1F, 1F);
	public static final RGBAColor YELLOW = new RGBAColor(1F, 1F, 0F, 1F);
	public static final RGBAColor TEAL = new RGBAColor(0F, 1F, 1F, 1F);
	public static final RGBAColor MAGENTA = new RGBAColor(1F, 0F, 1F, 1F);

	private float redValue, blueValue, greenValue, alphaValue;
	
	public RGBAColor(float redValue, float greenValue, float blueValue, float alphaValue) {
		this.redValue = redValue;
		this.blueValue = blueValue;
		this.greenValue = greenValue;
		this.alphaValue = alphaValue;
	}
	
	public float getRedValue() { return redValue; }

	public float getGreenValue() { return greenValue; }

	public float getBlueValue() { return blueValue; }
	
	public float getAlphaValue() { return alphaValue; }

	public RGBColor toRGBColor()
	{
		return new RGBColor(redValue, greenValue, blueValue);
	}

	@Override
	public RGBAColor copy()
	{
		return new RGBAColor(redValue, blueValue, greenValue, alphaValue);
	}
	
}
