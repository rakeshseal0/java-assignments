import java.util.Scanner;
class ass111{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = scan.nextLine();
		unique un = new unique();
		un.unq(str);

	}
}

class unique{
 void unq(String test) {
 	int p=0;
        String temp = "";
        for (int i = 0; i < test.length(); i++) {
            char ch = test.charAt(i);
            if (temp.indexOf(ch) == -1) {
                temp = temp + ch;
            } else {
                temp.replace(String.valueOf(ch),""); // added this to your existing code
            }
        }

        
        char[] a = temp.toCharArray();
        char b = a[1];
        System.out.print("The unique character is: "+b+ "; and ");
        char[] str = test.toCharArray();
        for(int i = 0; i< test.length(); i++)
        {
        	if(str[i] == b){
        	p = i;
        	break;
        }
        	
        }
        System.out.println("Location is:" + p);

    }
}