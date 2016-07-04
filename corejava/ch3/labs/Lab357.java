class Lab357
{
public static void main(String args[]){
Student st=new Student();
st.setAge(-12);
System.out.println(st.age);
}
}
class Student{
int age;
void setAge(int age){
this.age=age;
}
}
