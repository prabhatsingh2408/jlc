interface inter1{
void show();
}
class A{
public void show(){
System.out.println("A -> show()");
}
}

class B extends A implements inter1{}

class Lab551{
public static void main(String []args){
B ref=new B();
ref.show();
}
}

