import java.util.Scanner;


public class ass48{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

       // new check().ex1(scan.nextInt());
        new check().ex2();
    

        }
    }


class smallException extends Exception{
    public  smallException(){
        System.out.println("The number is small");
    }
}

class arrException extends Exception{
    public arrException(){
        System.out.println("Array Index out of range. Please handle Exception");
    }
}


class check{
    public void ex1(int a){

        if(a<10){
           try
               {throw new smallException(); }
            catch(smallException e){
                System.out.println("Exception Caught");

            }


            }
    }

    public void ex2()
    {   Scanner scan = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0; i<=4; i++){
            try{arr[i] = scan.nextInt();}
            catch(Exception ArrayIndexOutOfBoundsException){
                try{
                    throw new arrException();
                }
                catch(arrException e){
                    System.out.println("Array Exception Handled");
                }
            }
        }
    }
    
}