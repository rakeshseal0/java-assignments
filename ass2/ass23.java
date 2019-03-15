class vol{

    void volume(double a){
        System.out.println(a*a*a);
    }

    void volume(double a, double b, double c){
       System.out.println(a*b*c);
    }

}


class ass23{
    public static void main(String args[]){

        vol vol = new vol();
        vol.volume(10);
            }
}