package LCM;

public class LCM{

    public int lcm(int num1, int num2){
        int div = 1;
        if(num1 > num2 ){div = num2;}
        else{div = num1;}
    int i = 1;
        while(i < div){
            i++;
            if(num1%i==0 && num2%i==0){
                break;
            }

        }
        return i;
    }
}