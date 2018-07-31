import java.lang.Math;
import java.util.Scanner;

public class Point {
	int x;
	int y;
	
	Point(){
		x = 0;
		y = 0;
	}
	
	Point(int a, int b){
		x = a;
		y = b;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void changeX(int c) {
		x = c;
	}
	
	public void changeY(int d) {
		y = d;
	}
	
	public void change(int e, int f) {
		changeX(e);
		changeY(f);
	}
	
	public double distance(Point p2) {
		return Math.sqrt((p2.getX() - x) * (p2.getX() - x) +
						 (p2.getY() - y) * (p2.getY() - y));
	}
	
	public Point midpoint(Point p2) {
		int midX = (x + p2.getX()) / 2;
		int midY = (y + p2.getY()) / 2;
		return new Point(midX, midY);
	}
	
	public String toString() {
		String s = "(" + x + ", " + y + ")";
		return s;
	}
	
	public void getPoint() {
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Enter Point 1's x-coordinate: ");
		x = cin.nextInt();
		if (cin.hasNextLine())
			cin.nextLine();
		
		System.out.print("Enter Point 1's y-coordinate: ");
		y = cin.nextInt();
		if (cin.hasNextLine())
			cin.nextLine();
		
		cin.close();
	}
}

