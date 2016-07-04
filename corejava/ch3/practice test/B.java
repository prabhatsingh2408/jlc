package com.jlc.p2;
import com.jlc.p1.A;

class B extends A{
protected void show(){}
}
class C extends A{
public static void main(String [] args){

B ref=new B();
ref.show();
}
}