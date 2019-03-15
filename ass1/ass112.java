import java.util.Scanner;
class ass112{

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String str;
		System.out.println("Enter character to be removed: ");	
		str = scan.nextLine();
		char a;
		a = scan.next().charAt(0);
		char[] strarray = str.toCharArray();
	
				removeElement elem = new removeElement();
				elem.remove(strarray, a);
	}
}

class removeElement{

	void remove(char str[], char a){
		int pos=0;
		for(int i=0; i<str.length; i++){if(str[i] == a){pos+=1;}}
		for(int k=0; k<str.length*2; k++){
		for (int i = 0; i < str.length; i++) {
if (str[i]== a) {
for (int j = i + 1; i < str.length - 1; j++) {
	str[i] = str[j];
	i++;
	}
	}
		}
	}
		for(int i=0; i<str.length-pos; i++)
		{
			System.out.print(str[i]+" ");
		}

	}
}
