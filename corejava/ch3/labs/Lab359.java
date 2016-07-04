class Lab359
{
public static void main(String args[]){
Student st=new Student();
st.setAge(-12);
System.out.println(st.age);
}
}
class Student{
int age=18;
void setAge(int age){
if(age<18)
return 0;
this.age=age;
}
}
