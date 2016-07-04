package p897;

public class Lab897 {
public static void main(String[] args) {
	Direction.EAST.show();
	Direction.WEST.show();
	Direction.NORTH.show();
	Direction.SOUTH.show();
}
}
enum Direction{
	EAST(){
		void show(){
			System.out.println("showing EAST Direction");
		}
	},
	NORTH{
		void show(){
		System.out.println("showing NORTH Direction");	
		}
	},
	WEST{
		void show(){
		System.out.println("showing WEST Direction");	
		}
	},
	SOUTH{
		void show(){
		System.out.println("showing SOUTH Direction");	
		}
	};
	abstract void show();
}