package GCD;

public class GCD{
    public int gcd(int num1, int num2){
        int div = 0;
        if(num1 > num2){
            div =num2;

        }
        else{
            div = num1;
            num1 = num2;
            
        }

        for(int i=1; i<div; i++){
            if(num1%i == 0){
                //System.out.println(i);
                num2 = i;
            }
        }
        return num2;
    }
}