import java.util.Scanner;
class ass15{

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int r = scan.nextInt();
		System.out.println("The area of circle is: "+3.14*r*r +"and perimeter is: "+ 3.14*r*2);

	}

}