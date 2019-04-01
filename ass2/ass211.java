class ass211{

	public static void main(String args[]){
		volume vol = new volume(5);
		volume vol1 = new volume();
		vol1.radius = 6;
		vol1.volumeCalc();

	}
}

class volume{
	int radius = 0;
	volume(int r){                         //constructur overloaded for int argumen
		System.out.println("The volume is: "+ ((4/3)*3.14*r*r*r));
		return;
	}
	volume(){    //no constructur argument. need to assign volume then call function volumecalc

	}

	void volumeCalc(){
		int r = this.radius;
		System.out.println("The volume is: "+ ((4/3)*3.14*r*r*r));
		return;

	}
}