interface inter1{
void show();
}

class A {
public static void show(){
System.out.println("show method");
}
}

class Lab552 extends A implements inter1{
public void show(){}
}

