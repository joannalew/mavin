import java.util.*;  

public class HelloWorld {
	public static void main(String[] args) {	
		Point p1 = new Point();
		p1.getPoint();
		Point p2 = new Point();
		
		System.out.println("Points: " + p1.toString() + " " + p2.toString());
		System.out.println("Distance is " + p1.distance(p2));
		System.out.println("Midpoint is " + p1.midpoint(p2).toString());
		
	}
}
 





