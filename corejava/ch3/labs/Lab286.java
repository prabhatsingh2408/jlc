class Lab286
{
public static void main(String args[]){
customer c1=new customer();
c1.show();
customer c2=new customer();
c2.cid=99;
c2.cname="sri";
c2.phone=98989898;
c2.show();
}}
class customer{
int cid;
String cname;
long phone;
void show(){
System.out.println(cid);
System.out.println(cname);
System.out.println(phone);
}
}