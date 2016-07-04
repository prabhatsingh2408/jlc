package com.jlc.p2;

import com.jlc.p1.Hello;
class Lab516
{
public static void main(String[] args){
A oa=new A();
oa.display();
B ob=new B();
ob.display();

}
}
class A extends Hello{
public void display(){
super.display();
}
}
class B extends Hello{
public void display(){
System.out.println("B-> display()");

}
}


