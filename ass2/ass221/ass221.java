import sqr.sqr;
import root.root;
import java.util.Scanner;


class ass221{

	public static void main(String args[]){

		sqr sqr = new sqr();
		root root = new root();
		
		calculator calculator = new calculator();

		Scanner scan = new Scanner(System.in);

		double a=0, b=0;
		int c = 0;

		while(true){
			
			System.out.println("Enter Choice. \n 1. For sqr calculator   2. For root calculator");
			c = scan.nextInt();
			System.out.println("Enter data");

			if(c == 1){
			a = sqr.sqr(scan.nextInt());
			b = sqr.sqr(scan.nextInt());
		}

		else if(c == 0){
			a = root.root(scan.nextInt());
			b = root.root(scan.nextInt());

		}

		calculator.sum(a, b);
		calculator.diff(a, b);
		calculator.mul(a, b);
		calculator.div(a, b);




		}

	}



}

class cal{

	void sum(double a, double b){};
	void diff(double a, double b){};
	void mul(double a, double b){};
	void div(double a, double b){};
}

class calculator extends cal{
	void sum(double a, double b){
		System.out.println("Sum is: " + (a+b));
	}

	void diff(double a, double b){
		System.out.println("Difference is: " + (a-b));
	}

	void mul(double a, double b){
		System.out.println("Multiplication is: " + (a*b));
	}

	void div(double a, double b){
		System.out.println("Division is: " + (a/b));
	}


}
