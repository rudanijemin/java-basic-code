interface i1
{
    void show();
}
interface i2
{
    void display();
}
class test implements i1 ,i2
{
    public void show()
    {
        System.out.println("test 1");
    }
    public void display()
    {
        System.out.println("test 2");
    }

    
}


public  class interface1 {
    public static void main(String[] args) {
        test t = new test();
        t.show();
        t.display();
    }
    
}
