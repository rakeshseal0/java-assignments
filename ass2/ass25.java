class a{
    void message(){
        System.out.println("this is parent class");
    }
}

class b extends a{
    void message(){
        System.out.println("this is 1st child class");
        super.message();
    }
}

class c extends b{
    void message(){
        System.out.println("this is 2nd child class");
        super.message();
    }
}

class ass25{
    public static void main(String args[]){
        c c = new c();
        c.message();
    }
}