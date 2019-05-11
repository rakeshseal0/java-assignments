import java.util.*;
import java.io.*;

class ass41{

	public static void main(String args[]){
		problems p = new problems();
		//p.p1();
		//p.p2("ABCDEFAB");
		//p.p3("EBBA");
		//p.p4("EDCBA");
		p.p5("ABCDEF");

	}
}

class problems{

	public void p1(){
		char ch = 'R';
		String str = "R";
		String s = String.valueOf(ch);
		System.out.println("This is String " + s);
		char c = str.charAt(0);
		System.out.println(c);
	}

	public void p2(String s){

		char duplicateArray[] = new char[s.length()];
		int ctr = 0;

		char c[] = new char[s.length()];
		c = s.toCharArray();
		for(int i=0; i<c.length; i++){
			for(int j=i+1; j<c.length; j++){
				if(c[i] == c[j]){
					duplicateArray[ctr] = c[i];
					ctr += 1;
				}
			}
		}
		System.out.println("Duplicate Found: " + ctr);
		for(int i=0; i<duplicateArray.length; i++){
			System.out.println(duplicateArray[i]);
		}
	}

	public void p3(String s){

		char c[] = new char[s.length()];
		c = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<c.length; i++){
			stack.push(c[i]);
		}

		int flag =0;
		for(int i=0; i<c.length; i++){
			if(c[i] == stack.pop()){

			}
			else{
				System.out.println("Not a pallindrome");
				flag = 1;
				break;
			}
		}
		if(flag == 0){System.out.println("This is a pallindrome");}
	}

	public void p4(String s){
		char charArray[] = new char[s.length()];
		charArray = s.toCharArray();
		Arrays.sort(charArray);
		System.out.println((Arrays.toString(charArray)));	  
	}

	public void p5(String s){
		char charArray[] = new char[s.length()];
		charArray = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		for(int i=0; i<charArray.length; i++){
			st.push(charArray[i]);
		}
		for(int i=0; i<charArray.length; i++){
			System.out.print(st.pop());
		}
	}
}