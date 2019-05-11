import java.util.*;

class ass42{

	public static void main(String args[]){

		ArrayList<String> arrlist1 = new ArrayList<String>();
		ArrayList<String> arrlist2 = new ArrayList<String>();
		arrlist1.add("Hello");
		arrlist2.add("World");

		arrlist1.addAll(arrlist2);
		System.out.println(arrlist1);

	}
}