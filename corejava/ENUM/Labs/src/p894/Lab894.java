package p894;

public class Lab894 {
	public static void main(String[] args) {
		Direction d1=null;
		//d1=new Direction(0);
		//d1=Direction.East;
		System.out.println(d1);
		System.out.println(Direction.NORTH);
		System.out.println(Direction.WEST);
		System.out.println(Direction.SOUTH);
	}
	}
	enum Direction{
		EAST,NORTH,WEST,SOUTH;
		Direction(){
			System.out.println("**Direction() Def Cons**");
		}
		static{
			System.out.println("**Static Block in Direction class");
		}
	}
