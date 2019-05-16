class ass49{
    public static void main(String args[]){

        // rectangle rect = new rectangle(5, 10);
        // square sq = new square(5);
        // circle cir = new circle(5);

        // cir.setPriority(2);
        // sq.setPriority(10);
        // rect.setPriority(4);
        
        // cir.start();
        // sq.start();
        // rect.start();

        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{1, 2}, {3, 4}};
        matrixMul mat = new matrixMul(arr1, arr2, 2);
        daemon d = new daemon();
        d.setDaemon(true);
        mat.start();
        d.start();


    }
}

class rectangle extends Thread{
    int a, b;
    public rectangle(int a, int b){
        this.a = a;
        this.b = b;

    }
    public void run(){
        System.out.println("rectangle : "+ a*b);
    }

}

class square extends Thread{
    int r;
    public square(int r){
        this.r = r;
    }
     public void run(){
        System.out.println("square : "+ r*r);
    }

}

class circle extends Thread{
    int r;
    public circle(int r){
        this.r = r;
    }
    public void run(){
        System.out.println("circle : "+ r*r*3.14);
    }
}
    
class matrixMul extends Thread{
    int arr1[][];
    int arr2[][];
    int c[][] ;
    int n;

    public matrixMul(int[][] arr1, int[][] arr2, int n){
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.n = n;

        this.c = new int[n][n];
    }

    public void run(){

      for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    c[i][j] = c[i][j] + (arr1[i][k] * arr2[k][j]);
                    //System.out.println(c[i][j]);
                }
                }
            }

    for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" "+c[i][j]);
            }
            System.out.println("");
        }

        }
    
}

class daemon extends Thread{
    public void run(){
        int i = 0;
        while(i < 10){
            System.out.println("This is daemon thread");  //It is the lowest priority thread and will get stopped by jvm after other threads stopped running
            i++;
        }
    }
}
