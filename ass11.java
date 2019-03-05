import java.util.Scanner;
class ass11{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1st Number \n");
	int a = scan.nextInt();
	System.out.println("Enter 2nd Number \n");
	int b = scan.nextInt();
	product product = new product();
	float c = product.prd(a, b);
	System.out.println("The Product is: " + c);
	
} 

}

class product{

	float prd(int a, int b){
		return(a*b);
	}
}