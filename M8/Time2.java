// Time2.java

public class Time2 {

	// INSTANCE VARIABLES
	private int hour;	// 0 - 23
	private int minute;	// 0 - 59
	private int second; // 0 - 59
	
	// CONSTRUCTORS
	//No argument constructor puts Time2 object into a consistent state
	public Time2() {
		this(0, 0, 0);
	} // end no-argument constructor
	
	//1 argument constructor puts Time2 object into a consistent state
	public Time2(int h) {
		this(h, 0, 0);
	} // end 1 argument constructor
	
	//2 argument constructor puts Time2 object into a consistent state
	public Time2(int h, int m) {
		this(h, m, 0);
	} // end 2 argument constructor
	
	//3 argument constructor puts Time2 object into a consistent state
	public Time2(int h, int m, int s) {
		setTime(h, m, s);
	} // end 3 argument constructor
	
	//Constructor to take anothr Time2 object
	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	} // end no-argument constructor
	
	// SET METHODS
	// Set the current time
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	} // end setTime method
	
	// Set Hour
	public void setHour(int h) {
		hour = ((h >= 0 && h < 24) ? h : 0);
	} // end setHour method
	
	// Set Minute
	public void setMinute(int m) {
		minute = ((m >= 0 && m < 60) ? m : 0);
	} // end setSecond method
	
	// Set Second
	public void setSecond(int s) {
		second = ((s >= 0 && s < 60) ? s : 0);
	} // end setSecond method
	
	// Increment Hour
	public void incrementHour() {
		setHour(getHour() + 1);
	} // end incrementHour method
	
	// Increment Minute
	public void incrementMinute() {
		setMinute(getMinute() + 1);
		if (getMinute() == 0)
			incrementHour();
	} // end incrementMinute method
	
	// Tick - increase time by one second
	public void tick() {
		setSecond(getSecond()+1);
		if (getSecond() == 0)
			incrementMinute();
	} // end tick method
	
	// GET METHODS
	// get hour value
	public int getHour() {
		return hour;
	} // end getHour method

	// get minute value
	public int getMinute() {
		return minute;
	} // end getMinute method
	
	// get second value
	public int getSecond() {
		return second;
	} // end getSecond method
	
	// OUTPUT METHODS
	//Convert to String in universal-time
	public String toUniversalString() {
		return String.format(
			"%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
	} // end toUniversalString method

	//Convert to String in standard-time
	public String toString() {
		return String.format( "%02d:%02d:%02d %s", 
			((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
			getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM") );
	} // end toString method
	
}// end Time2 class