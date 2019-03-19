class interest{
    void rate(){
        System.out.println("interest rate is 0%");
    }
}

class sbi extends interest{
    @Override
    void rate(){
        System.out.println("interest rate for sbi is 8%");
    }
}

class icici extends interest{
    @Override
    void rate(){
        System.out.println("interest rate for icici is 7%");
    }
}

class axis extends interest{
    @Override
    void rate(){
        System.out.println("interest rate for axis is 9%");
    }
}

class ass24{
    public static void main(String args[]){
        sbi sbi = new sbi();
        icici icici = new icici();
        axis axis = new axis();
        sbi.rate();
        icici.rate();
        axis.rate();
    }
}