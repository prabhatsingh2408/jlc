package util;

import java.util.*;

public class Lab842{
public static void main(String[] args) {
	Queue<String> que=new PriorityQueue<String>();
	que.add("Srinivas");
	que.add("Manish");
	que.add("Ranjan");
	que.offer("Kumar");
	que.offer("Dande");
	que.offer("Srinivas");
	System.out.println(que);
	System.out.println("size :" + que.size());
	System.out.println("Peek :" + que.peek());
	System.out.println("Size :" + que.size());
	System.out.println("Element :" + que.element());
	System.out.println("Size :" + que.size());
	System.out.println("Poll :" + que.poll());
	System.out.println("Size :" + que.size());
	}	
	}
