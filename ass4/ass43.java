import java.util.Scanner;
class ass43{

	public static void main(String args[]){

		volume v = new volume();
		v.vol();
	}


}

class volume{
	int radius = 0;
	volume(int r){
		this.radius = r;
	}
	volume(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		this.radius = scan.nextInt();
	}

	public void vol(){
		System.out.println("The volume is: " + (radius*radius*radius));
	}
}