class consdemo{
    int a;
    consdemo() //always constructor name same as a class name
    {
        System.out.println("default constructor");
    }
    consdemo(int x)
    {
        a=x;
        System.out.println("paramiterize constructor a="+a);
    }
}

public class constructor {
    public static void main(String args[]) {
        consdemo m1 = new consdemo(10);  // constructor no need to call
        consdemo m2 = new consdemo();
    }
    
}
