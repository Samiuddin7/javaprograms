import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("enter operator ");
		String operator = sc.next();
		
		if (operator.equals("+")){
		System.out.println(a+b);
		}
		else if (operator.equals("-")){
			System.out.println(a-b);
		}
		else if (operator.equals("*")){
			System.out.println(a*b);
		}
		else if (operator.equals("/")){
			System.out.println(a/b);
		}
	
		
	}

}
