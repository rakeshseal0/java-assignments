import pow.pow;

class ass219{

	public static void main(String args[]){
		pow p = new pow();
		calculate cal = new calculate(p.num(5), p.num(6));
		cal.sum();
		cal.diff();
		cal.mul();

	}
}

class calculate{
	double num = 0;
	double num1 = 0;
	calculate(double num, double num1){
		this.num = num;
		this.num1 = num1;

	}

	void sum(){
		System.out.println("Sum is: "+ (num1+num));

	}

	void diff(){
		System.out.println("Diff is: "+ (num1-num));

	}

	void mul(){
		System.out.println("Multiplication is: "+ (num1*num));

	}

}