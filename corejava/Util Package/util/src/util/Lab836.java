package util;

import java.util.*;

public class Lab836{
public static void main(String[] args) {
		ArrayList<Number> ls=new ArrayList<Number>();
		ls.add(12345);
		ls.add(99999);
		ls.add(72727);
		showElement(ls);
		ArrayList<Float> fls=new ArrayList<Float>();
		fls.add(999.999F);
		fls.add(123.456F);
		fls.add(711.801F);
		showElement(fls);
		ArrayList<?> sls=new ArrayList<String>();
		//showElement(sls);
			}
static void showElement(List<? extends Number>list ){
	for(Number num:list){
		System.out.println(num +",");
	}
	System.out.println("\n");
	}
	}
