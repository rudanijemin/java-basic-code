
class test{
    void show()
    {
        System.out.println("class A");
    }
}
class demo extends test {
    void show()
    {
        System.out.println("class B");
    }
}

public class runtimee {
    public static void main(String[] args) {
        test t = new test();
        t.show();
    
        demo d = new demo();
        d.show();   
    }   
}