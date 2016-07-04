interface inter1{
void show();
}
interface inter2{
int show();
}
class A implements inter1{
public void show(){}
}
class B implements inter2{
public int show(){return 0;}
}

class Lab552 implements inter1, inter2{
public void show(){}
public int show(){}

}

