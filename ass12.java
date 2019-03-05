import java.util.Scanner;

class ass12{

	public static void main(String args[]){
		int b = 1;
		Scanner scan = new Scanner(System.in);
		check check = new check();
		while(b > 0){
			System.out.println("Enter Number to check");
			int a = scan.nextInt();
			check.checker(a);
			

		}
	}
}

class check{

	void checker(int a){

		if(a%2 == 1){System.out.println("Number is odd");}
		else{System.out.println("Number is even");}
	}

}