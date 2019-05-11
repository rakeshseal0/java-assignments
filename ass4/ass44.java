import java.util.*;
class ass44{
	public static void main(String args[]){
		area A = new area();
		A.choose();

	}
}

interface myinterface{

}

class area implements myinterface{
	public void choose(){
		System.out.println(" 1. Circle \n 2. Rectangle \n 3. square");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		if(choice == 1){
			System.out.println("Enter vitals: ");
			int radius = scan.nextInt();
			System.out.println("Area is: " + 3.14*radius*radius);
		}
		else if(choice == 2){
			System.out.println("Enter vitals: ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Area is: " + a*b);
		}
		else if(choice == 3){
			System.out.println("Enter vitals: ");
			int asq = scan.nextInt();
			System.out.println("Area is: " + asq*asq);
		}
		else{
			System.out.println("Invalid choice");
		}

	}
}