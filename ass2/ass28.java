import java.util.ArrayList;


class arrlist{
	ArrayList<String> array;
	private int i = 0;
	
	arrlist(){
		int capacity = 10;    //initial capacity specified

		ArrayList<String> array = new ArrayList<String>();
		System.out.println("capacity is: " + capacity);	
		this.array = array;
	}

	boolean add(String str){
		if(i<10){

		array.add(str);
		i++;
		return true;
		}
		else{
			return false;
		}
	}

	boolean remove(int pos){
		if(pos<10 && pos>0){
			array.remove(pos);
			i--;
			return true;
		}

		else{
			System.out.println("position not found in array");
			return false;
		}
	}

	boolean sAndDel(String str){                  //deletes 1st occurance
		if(array.contains(str)){
			array.remove(array.indexOf(str));
			i--;
			return true;
		}
		else{
			System.out.println("Element not found");
			return false;
		}

	}

	void deleteElem(String str){                 //del all
		for(int i=0; i<array.size(); i++){
			if(array.get(i) == str){
				array.remove(i);
			}
		}

	}

	void printList(){
		
			System.out.println(array);
		
	}

	int capacity(){
		return(int)(this.i);
	}

	void addlist(ArrayList arr){
		array.add(arr);
	}

	void modify(int pos, String str){
		array.set(pos, str);
	}


}

public class ass28{
	public static void main(String args[]){
		arrlist arr = new arrlist();
		for(int i=0; i<5; i++){
		arr.add("hii");
		arr.add("hii1");
	}
	arr.printList();
	arr.remove(15);
	arr.printList();
	arr.sAndDel("hii");
	arr.printList();
	arr.deleteElem("hii");
	arr.printList();

	

	}
}