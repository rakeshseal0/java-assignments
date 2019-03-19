//some methods overloaded but never used. feel free to use class{complex} with int type of data.
import java.util.Scanner;

class complex{
    void sum(int r1, int c1, int r2, int c2){
        System.out.println("the sum is: "+(r1+r2)+" + j"+(c1+c2));
    }

    void diff(int r1, int c1, int r2, int c2){
        System.out.println("the diff is: "+(r1-r2)+" + j"+(c1-c2));
    }

    void sum(double r1, double c1, double r2, double c2){
        System.out.println("the sum is: "+(r1+r2)+" + j"+(c1+c2));
    }

    void diff(double r1, double c1, double r2, double c2){
        System.out.println("the diff is: "+(r1-r2)+" + j"+(c1-c2));
    }

    void product(double r1, double c1, double r2, double c2){
        System.out.println("the product is: "+(r1*r2 - c1*c2)+" + j"+(r1*c2 + r2*c1));
    }
}

class complex1 extends complex{
    @Override
    void sum(double r1, double c1, double r2, double c2){
        System.out.println("the sum with overriden method is: "+(r1+r2)+" + j"+(c1+c2));
    }

    @Override
    void diff(double r1, double c1, double r2, double c2){
        System.out.println("the diff with overridden method is: "+(r1-r2)+" + j"+(c1-c2));
    }

    @Override
    void product(double r1, double c1, double r2, double c2){
        System.out.println("the product with overridden is: "+(r1*r2 - c1*c2)+" + j"+(r1*c2 + r2*c1));
    }


}


class ass26{
    

    public static void main(String args[]){
        double r1, r2, r3, r4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter complex quantities");
        r1 = scan.nextDouble();
        r2 = scan.nextDouble();
        r3 = scan.nextDouble();
        r4 = scan.nextDouble();
        complex complex = new complex();
        complex.sum(r1, r2, r3, r4);
        complex.diff(r1, r2, r3, r4);
        complex.diff(r1, r2, r3, r4);

        complex1 complex1 = new complex1();
        complex1.sum(r1, r2, r3, r4);
        complex1.diff(r1, r2, r3, r4);
        complex1.diff(r1, r2, r3, r4);



    }
}