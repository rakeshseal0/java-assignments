import java.util.Scanner;
class ass18{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number for getting factorial of it: ");
		int a = scan.nextInt();
		float fact = 1;
		for(int i = 1; i<(a+1); i++){
			fact*=i;
		}
		System.out.println("The factorial is: "+ fact);

	}
}