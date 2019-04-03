class ass217{
	public static void main(String args[]){

		shape circle = new circle();
		shape square = new square();
		circle.area(5);
		square.area(5);

	}
}


abstract class shape{

abstract void area(int a);
//abstract void area(int l, int r);
}

class circle extends shape{

	 public void area(int r){
		System.out.println("Area is: "+ 3.148*r*r );
	}

}

class square extends shape{

	 public void area(int r){
		System.out.println("Area is: "+ r*r );
	}

}