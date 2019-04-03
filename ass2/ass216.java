class ass216{
	public  static void main(String args[]){

		square sq = new square();
		rectangle rect = new rectangle();
		circle cr = new circle();

		sq.area(5);
		rect.area(5, 5);
		cr.area(5);

	}
}

interface shape{
	 void area(int r);
	}
interface shape1{
	void area(int l, int b);
}
 class circle implements shape{

	//@Override
	public void area(int r){
		try{System.out.println("Area of circle is: "+ 3.14*r*r);}
		catch(Exception e){
			System.out.println("Invalid argument");
		}
	}


}

class rectangle implements shape1{

	//@Override
	public void area(int l, int b){
		System.out.println("Area is: "+ l*b);
	}

}
class square implements shape{

	//@Override
	public void area(int a){
		System.out.println("Area is: "+ a*a);
	}

}