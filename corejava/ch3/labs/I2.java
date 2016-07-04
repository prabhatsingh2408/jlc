interface I2{
int AB=90;
}
class Hello{
String AB="JLC";
}
class Hai extends Hello implements I2{
void show(){
System.out.println(super.AB);
System.out.println(I2.AB);
}
}