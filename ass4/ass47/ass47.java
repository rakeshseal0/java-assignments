import GCD.GCD;
import LCM.LCM;

class ass47{

public static void main(String args[]){
    GCD gcd = new GCD();
    LCM lcm = new LCM();
    int g = gcd.gcd(10, 25);
    int l = lcm.lcm(10, 25);
    System.out.println(g);
     System.out.println(l);
    }

}