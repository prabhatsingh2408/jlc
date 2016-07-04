package util;

import java.util.*;

public class Lab843{
public static void main(String[] args) {
	Queue<String> que=new PriorityQueue<String>();
	que.add("Srinivas");
	que.add("Manish");
	que.add("Ranjan");
	que.offer("Kumar");
	que.offer("Dande");
	int len=que.size();
	for(int i=0;i<len;i++){
	System.out.println(que.poll());
	}
	System.out.println("\n********");
	Queue<String> que1=new PriorityQueue<String>(10, new PSort());
	que1.add("Srinivas");
	que1.add("Manish");
	que1.add("Ranjan");
	que1.offer("Kumar");
	que1.offer("Dande");
	int len1=que1.size();
	for(int i=0;i<len;i++)
	System.out.println(que1.poll());
	}	
	}
    class PSort implements Comparator<String>{
	public int compare(String in1,String in2){
		return in2.compareTo(in1);
	}
}