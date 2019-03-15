import java.util.Scanner;
class ass19{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year to check: ");
		int year = scan.nextInt();
		if(year%100 == 0){
			if(year%400 == 0){
				System.out.println("It is a lea year");
				return;
			}
			else{System.out.println("It is not a leap year");}
		}
		else{

			if(year%4 == 0){System.out.println("It is a lea year");
			return;}
			else{System.out.println("It is not a leap year");}
		}
	}
}