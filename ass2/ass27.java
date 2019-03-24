import java.util.Scanner;
class matrix{
    int row, col;
    int[][] mat;
    matrix(int row, int col){
        this.row = row;
        this.col = col;
        int[][] mat = new int[row][col];
        this.mat = mat;
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<(row); i++){
            {
                for(int j=0; j<col; j++){
                    System.out.println("enter matrix["+i+"]"+"["+j+"]");
                    mat[i][j] = scan.nextInt();
                }
            }

        }
    }

    void printData(){
        for(int a=0; a<row; a++){
            for(int i=0; i<col; i++){
            System.out.print(mat[a][i]+" ");
            }
            System.out.println("");
        }
    }

    int getRow(){
       // System.out.println("The number of row is: "+this.row);
        return(this.row);
    }

    int getCol(){
        //System.out.println("The number of row is: "+this.col);
        return(this.col);
    }

    boolean Changedata(int rowNum, int colNum, int num)                     //returns true if success.
    {    
        try{
            mat[rowNum][colNum] = num;
            return true;
        }
        catch(Exception ex){
            System.out.println("Unexpected error occured");
            return false;
        }
    }  

    void addMatrix(matrix matr){                            //pass object of the matrix that is to be added
        if(matr.getRow() == row && matr.getCol() == col){

          for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
            mat[i][j] = mat[i][j] + matr.mat[i][j];
            }
            System.out.println("");
        }  
        }
        else{
            System.out.println("dimension error");
        }
    }

    void multiplyMatrix(matrix matr){                   //pass object of the matrix which nees to be multiplied
        int[][] c = new int[row][matr.col];
        if(row == matr.col){
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < row; j++)
            {
                for (int k = 0; k < row; k++)
                {
                    c[i][j] = c[i][j] + mat[i][k] * matr.mat[k][j];
                    
                    }
                }
            }
        }
        else{
            System.out.println("dimension error");
        }
         mat = c; 
    }   
    
}


class ass27{
    public static void main(String args[]){
        matrix m = new matrix(2, 2);                // call method by providing row and column as argument.
        m.printData();
        matrix m1 = new matrix(2,2);
        m1.printData();
        System.out.println("number of row is: "+m1.getCol());
        System.out.println("number of col  is: "+m1.getRow());
        //m1.Changedata(1, 2, 5);
        m1.printData();
        m1.addMatrix(m);
        m1.printData();
        m1.multiplyMatrix(m);
        m1.printData();
        

    }

}