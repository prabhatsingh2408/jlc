package p898;

import java.util.*;

public class Lab898 {
public static void main(String[] args) {
	Set<Direction>set=EnumSet.allOf(Direction.class);
	System.out.println(set);
	Map<Direction,Integer>map=new EnumMap(Direction.class);
	map.put(Direction.EAST,0);
	map.put(Direction.NORTH,90);
	map.put(Direction.WEST,180);
	map.put(Direction.SOUTH,270);
	System.out.println(map);
}
}
enum Direction{
	EAST,NORTH,WEST,SOUTH
}