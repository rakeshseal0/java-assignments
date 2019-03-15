import java.util.Scanner;

class ass113{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = scan.nextLine();
		ass113 ass = new ass113();
		System.out.println("the number of vowel is: "+(ass.vowelCounter(str)));
		
	}
	private int vowelCounter(String str){
		int pos = 0;
		char[] strArr = str.toCharArray();
		for(int i=0; i<strArr.length; i++){
			if(strArr[i] =='a'||strArr[i] =='e'||strArr[i] =='i'||strArr[i] =='o'||strArr[i] =='u'){pos++;}
		}
		return pos;
	}
}