class ass21{
    static int ctr0 = 0;
    int ctr1 = 0;
    public static void main(String args[]){

        //counter with static var
        for(int i=0; i<10; i++){
            
            ctr0++;
        }
        System.out.println("the counter with static is: " +ctr0);
    

    //counter without static
    ass21 ass = new ass21();
    for(int i=0; i<10; i++){
        ass.ctr1++;
    }
    System.out.println("the counter without static is: " +ass.ctr1);
    }

}

// the difference is that for static variables we dont need to create object of their class to use them but for non static
//object we need to to create object of their class before using them.
