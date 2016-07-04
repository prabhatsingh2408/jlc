package p896;

public class Lab896 {
public static void main(String[] args) {
	Direction d=Direction.EAST;
	switch(d){
	case EAST:
		System.out.println("EAST Direction Selected");break;
	case NORTH:
		System.out.println("NORTH Direction Selected");break;
	case WEST:
		System.out.println("WEST Direction Selected");break;
	case SOUTH:
		System.out.println("SOUTH Direction Selected");break;
	}
}
}
enum Direction{
	EAST,NORTH,WEST,SOUTH
}