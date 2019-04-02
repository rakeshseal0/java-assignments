//if a class has at least one pure virtual function, 
//then the class becomes abstract. Unlike C++, in Java, a separate keyword abstract is used to make a class abstract


import java.util.Scanner;

class ass214{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Select any Bank: \n A \t B \n C \t D");
		int opt = scan.next().charAt(0);

		if(opt == 'A'){
			interest A = new A();
			A.interest();
		}
		else if(opt == 'B'){
			interest B = new B();
			B.interest();
		}
		else if(opt == 'C'){
			interest C = new C();
			C.interest();
		}
		else if(opt == 'D'){
			interest D = new D();
			D.interest();
		}
		else{
			System.out.println("Incorrect option chosen. RAKESH SEAL");
		}


	}


}

abstract class interest{
	abstract void interest();
}

class A extends interest{
	void interest(){System.out.println("Interest rate is for A is 10%");}
}
class B extends interest{
	void interest(){System.out.println("Interest rate is for B is 12%");}
}

class C extends interest{
	void interest(){System.out.println("Interest rate is for C is 13%");}
}

class D extends interest{
	void interest(){System.out.println("Interest rate is for D is 15%");}
}