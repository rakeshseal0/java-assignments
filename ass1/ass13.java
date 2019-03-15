import java.util.Scanner;
class ass13{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		check check = new check();
		while(true){
			System.out.println("Enter number to check: ");
			int a = scan.nextInt();
			check.checker(a);
		}

	}
}
class check{
	void checker(int a){
		if(a ==1 ){System.out.println("This is not a prime Number"); return;}

		for(int i = a/2; i<a; i++){
			if(a%i == 0){
				System.out.println("the number is not prime");
				return ;
			}
		}
		System.out.println("It is a prime number");
}

}

