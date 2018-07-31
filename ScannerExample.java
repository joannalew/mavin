import java.util.*;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int num;

		System.out.print("Enter your name: ");
		Scanner cin = new Scanner(System.in);
		name = cin.nextLine();
		System.out.println("Your name is " + name);

		System.out.print("Enter a number: ");
		num = cin.nextInt();
		System.out.println("The number squared is: " + num * num);

		if (cin.hasNextLine())
			cin.nextLine();

		System.out.print("Enter your name: ");
		name = cin.nextLine();
		System.out.println("Your name is " + name);
		
		cin.close();
	}

}

