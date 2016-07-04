package p895;

public class Lab895 {
public static void main(String[] args) {
	Direction arr[]=Direction.values();
	for(Direction d:arr){
		System.out.println(d.ordinal()+"\t"+d.name());
	}
	try{
		Direction d=Direction.valueOf("east");
		System.out.println("**Direction found with the name");
	}catch(IllegalArgumentException e){
		System.out.println("No Direction Found With The Name");
	}
	Direction d=Direction.valueOf("EAST");
	System.out.println(d);
}
}
enum Direction{
	EAST(0),NORTH(90),WEST(180),SOUTH(270);
	int angle;
	Direction(int angle){
		this.angle=angle;
		System.out.println("Direction () of Cons");
	}
	static{
		System.out.println("**Static Block in Direction class\n");
	}
}