package com.wbrandon.utillib.loop;

public class TimedLoop
{
	
	private static final int NANOSECONDS_IN_SECOND = 1_000_000_000;
	
	private Loopable loopable;
	private double cyclesPerSecond;
	private long intervalNanoTime;
	
	private boolean isActive;
	private long cycleNumber, lastLoopNanoTime;
	
	public TimedLoop(Loopable loopable, double cyclesPerSecond)
	{
		this.loopable = loopable;
		this.cyclesPerSecond = 0;
		intervalNanoTime = 0;
		setCyclesPerSecond(cyclesPerSecond);
		isActive = false;
		cycleNumber = 0;
		lastLoopNanoTime = 0;
	}
	
	public void start()
	{
		cycleNumber = 0;
		lastLoopNanoTime = 0;
		isActive = true;
		while(isActive)
		{
			if(getNanoTimeSinceLastLoop() > intervalNanoTime)
			{
				cycleNumber++;
				loopable.cycle(cycleNumber);
				lastLoopNanoTime = System.nanoTime();
			}
		}
	}
	
	public void stop()
	{
		isActive = false;
	}
	
	public void restart()
	{
		stop();
		start();
	}
	
	public Loopable getLoopable() { return loopable; }
	
	public double getCyclesPerSecond() { return cyclesPerSecond; }
	public void setCyclesPerSecond(double cyclesPerSecond)
	{
		this.cyclesPerSecond = cyclesPerSecond;
		intervalNanoTime = Math.round(NANOSECONDS_IN_SECOND / cyclesPerSecond);
	}
	
	public long getIntervalNanoTime() { return intervalNanoTime; }
	
	public boolean isActive() { return isActive; }
	
	public long getNanoTimeSinceLastLoop()
	{
		return System.nanoTime() - lastLoopNanoTime;
	}
	
}
