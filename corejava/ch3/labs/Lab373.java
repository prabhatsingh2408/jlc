class Lab373
{
public static void main(String args[]){
Hello h=new Hello();
System.out.println(h.isdigit('A'));
System.out.println(h.isdigit('8'));
}
}
class Hello{
boolean isdigit(char ch){
System.out.println("isdigit() :" + ch);
if(ch>=48 && ch<=57)
return true;
else
return false;
}
}
