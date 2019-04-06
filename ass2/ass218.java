class ass218{

	public static void main(String args[]){

		employee e = new employee();
		e.name("abc");
		e.salary(10000);


	}
}

interface details{
	 abstract void name(String a);
	//void age();
}

interface salary{
	abstract void salary(int a);
}

class employee implements details,salary{

public void name(String a){
		System.out.println("Name is "+a);
	}
	public void salary(int a){
		System.out.println("salary is "+a);
	}
}
