class ass210{
	public static void main(String args[]){
		cycle cycle = new cycle("hero", "red");
		cycle.attr();
		cycle.newMethod();

		bike bike = new bike("yamaha", "black");
		bike.attr();
		bike.newMethod();

	}
}


class vehicle{
	String name = "";
	String color = "";

	void attr(){
		System.out.println(this.name);
		System.out.println(this.color);
	}
}

class cycle extends vehicle{
	cycle(String name, String color){
		super.name = name;
		super.color = color; 
	}
	
	void newMethod(){
		System.out.println("This is new method for cycle subclass");
	}

}

class bike extends vehicle{
	bike(String name, String color){
		super.name = name;
		super.color = color; 
	}
	
	void newMethod(){
		System.out.println("This is new method for bike subclass");
	}

}