import java.util.Scanner;
class ass14{

	public static void main(String args[]){
		 int num = 0, reversedInteger = 0, remainder, originalInteger;
		 Scanner scan = new Scanner(System.in);
		 while(true){
		 	num = scan.nextInt();

        originalInteger = num;

        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
        originalInteger = reversedInteger = 0;
    

	}
}
}