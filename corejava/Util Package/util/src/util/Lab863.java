package util;

import java.util.*;

public class Lab863{
public static void main(String[] args) throws Exception{
	System.out.println("About to schedule task");
	new Reminder(5);
	System.out.println("Task scheduled");
	}	
	}
class Reminder{
	Timer timer;
	public Reminder(int seconds){
		timer=new Timer();
		timer.schedule(new RemindTask(),seconds*1000);
	}
	class RemindTask extends TimerTask{
		public void run(){
			System.out.println("Time's up");
			timer.cancel();
		}
	}
}