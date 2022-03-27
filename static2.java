class test{
    static int a=10;  //static variable
    static int b=20;
    int c=30;

    static void add()   //static method
    {
        System.out.println("sum= "+(a+b));
    }
    static
    {
        System.out.println("i am in a static block");
        b=b*4;
    }

}

class static2{
    public static void main(String[] args) {
        // test t1 = new test();
        test.add();  // static method call without create object

    }

}