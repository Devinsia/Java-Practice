// 9/11/2025 Thursday
import java.util.Scanner;
import java.util.concurrent.*;

public class Time {
	private int hour; // 0 - 23  
	private int minute; // 0 - 59
	private int second; // 0 - 59
	
	// Constructor Overloading
	
	public Time(){
		this(12, 0, 0);
	}
	
	public Time(int hour){
		this(hour, 0, 0);
	}
	
	public Time(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	// constructor with Time object
	public Time(Time obj) {
		this(obj.hour, obj.minute, obj.second);
	}
	
	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	public void setHour(int hour) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException(               
			         "hour was out of range");
		}
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if ( minute < 0 || minute >= 60) {
			throw new IllegalArgumentException(               
			         "minute was out of range");
		}
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException(               
			         "second was out of range");
		}
		this.second = second;
	}

	// set a new time value using universal time; throw an
	// exception if the hour, minute or second is invalid
	public void setTime(int hour, int minute, int second) {  
		setHour(hour);
		setMinute(minute);
		setSecond(second);	
	} 
	
	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
	   return String.format("%02d:%02d:%02d", hour, minute, second);
	} 
	
	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
	   return String.format("%d:%02d:%02d %s",         
	      ((hour == 0 || hour == 12) ? 12 : hour % 12),
	      minute, second, (hour < 12 ? "AM" : "PM"));  
	} 
	
	public void tick() {
		second += 1;
		if (second > 59) {
			second = 0;
			minute += 1;
			if(minute > 59) {
				minute = 0;
				hour +=1;
				}
				if (hour > 23) {
					hour = 0;
				}
			}
		}

	
	public static void main(String[] args) {
		Time t1 = new Time(23, 59, 25);
		while(true) {
			try {
				TimeUnit.SECONDS.sleep(1); // Sleep for 1 second
				
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Thread was interrupted while sleeping.");
			}
			t1.tick();	
			System.out.println(t1.toUniversalString());
		}
		/*
		 Scanner input = new Scanner(System.in);
		 
		Time t1, t2, t3, t4, t5, t6;
		
		int h, m, s;
		
		// repeated input in case of invalid values for t1
		while(true) {
			try {
				
				t1 = new Time();
				t2 = new Time();
				t3 = new Time(14);
				t4 = new Time(6,35);
				t5 = new Time(10, 25, 15);
				t6 = new Time(t5);
				
				System.out.print("Enter hour, minute, second: ");
				
				h = input.nextInt();
				m = input.nextInt();
				s = input.nextInt();
				
				t1.setTime(h, m, s);
				break;
			} 
			catch( IllegalArgumentException e) {
				System.out.printf("%s%n", e.getMessage());

			}
		}
		
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", t1, t2, t3, t4, t5, t6);
		input.close();
		*/
	}

} 
