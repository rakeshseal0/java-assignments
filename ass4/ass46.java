import java.io.*;

class ass46{
    public static void main(String args[]){
        str s = new str();
        try{
            s.rev("HELLO", "WORLD");
            s.upper("Hello");
        }
        catch(Exception e){
            System.out.println("Unknown error");
        }
    }
}

class str{
    void rev(String str1, String str2) throws Exception
    {
        StringBuffer s1 = new StringBuffer(str1);
        StringBuffer s2 = new StringBuffer(str2);
        s1.reverse();
        s2.reverse();
        final String strng = s1.toString() + s2.toString();
        System.out.println(strng);
    }

    void upper(String str) throws Exception
    {
        StringBuffer s = new StringBuffer(str);
        System.out.println(s.toString().toUpperCase());
    }

}