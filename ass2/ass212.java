class ass212{
	public static void main(String args[]){
		child child = new child();
		child.method();

		//parent parent = new parent();
		//parent.method();


	}
}

class parent{

void method(){
	System.out.println("This is parent class method");
}

}

class child extends parent{

	@Override
	void method(){
		super.method();
	System.out.println("This is child class method");
}

}