//with defaut access mod

class calculator{
    double a, b;
    calculator(){
       this.a = 0;
       this.b = 0;
    }
    double add(double a, double b){
        return(a + b);
    }

    double sub(double a, double b){
        return(a - b);
    }

    double multi(double a, double b){
        return(a*b);
    }
}


//*******************************************************************************************


//for public access modifier

/*
class calculator{
    double a, b;
    calculator(){
       this.a = 0;
       this.b = 0;
    }
    public double add(double a, double b){
        return(a + b);
    }

    public double sub(double a, double b){
        return(a - b);
    }

   public double multi(double a, double b){
        return(a*b);
    }
}

*/
//*****************************************************************/
//for protected access mod
/*
class calculator{
    double a, b;
    calculator(){
       this.a = 0;
       this.b = 0;
    }
    protected double add(double a, double b){
        return(a + b);
    }

    protected double sub(double a, double b){
        return(a - b);
    }

   protected double multi(double a, double b){
        return(a*b);
    }
}
*/

//*********************************************************************************** */

//for private access mod, and this will not work throwing a compilation error.
/*
class calculator{
    double a, b;
    calculator(){
       this.a = 0;
       this.b = 0;
    }
    private double add(double a, double b){
        return(a + b);
    }

    private double sub(double a, double b){
        return(a - b);
    }

   private double multi(double a, double b){
        return(a*b);
    }
}
*/


class ass22{
    public static void main(String args[]){
        calculator calc = new calculator();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.sub(2, 3));
        System.out.println(calc.multi(2, 3));
    }
}