
abstract class Person
{
abstract void sleeping();
}
abstract class Student extends Person{
void sleeping(){
System.out.println("Student-> sleeping");
}
}
class CurrentStudent extends Student{}
class Lab536{
public static void main(String []args){
Person pob=new CurrentStudent();
pob.sleeping();

}
}

