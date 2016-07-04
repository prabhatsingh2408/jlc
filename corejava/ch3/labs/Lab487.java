package com.jlc.p2;

import com.jlc.p1.Hello;

class Lab487{
public static void main(String[] args){
Hai hai=new Hai();
hai.show();
}
}
class Xyz extends Hello{}

class Hai extends Hello{
 void show(){
System.out.println("Hai-> show()");
Hello h=new Hello();
System.out.println(h.ab);
Xyz ref=new Xyz();
System.out.println(ref.ab);
}
}


