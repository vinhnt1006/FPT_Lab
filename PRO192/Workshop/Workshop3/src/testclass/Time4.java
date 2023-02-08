package testclass;

public class Time4 {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	public Time4() {
		super();
	}

	public Time4(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public Time4 nextSecond() {
		second++;
		if (second >= 60) {
			second =0;
			minute++;
			if (minute >= 60) {
				minute = 0;
				hour++;
				if (hour >= 24)
					hour = 0;
			}
		}
		return this;
	}

	public Time4 nextMinute() {
		minute++;
		if (minute >= 60) {
			minute = 0;
			hour++;
			if (hour >= 24)
				hour = 0;
		}
		return this;
	}

	public Time4 nextHour() {
		hour++;
		if (hour >= 24)
			hour = 0;
		return this;
	}

	public Time4 previousSecond() {
		second--;
		if (second < 0) {
			second = 59;
			minute--;
			if (minute < 0) {
				minute = 59;
				hour--;
				if (hour < 0)
					hour = 23;
			}
		}
		return this;
	}

	public Time4 previousMinute() {
		minute--;
		if (minute < 0) {
			minute = 59;
			hour--;
			if (hour < 0)
				hour = 23;
		}
		return this;

	}

	public Time4 previousHour() {
		hour--;
		if (hour < 0)
			hour = 23;
		return this;
	}
	
	//to String
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%02d:%02d:%02d",hour, minute, second );
	}

}
