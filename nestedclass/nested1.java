class outer
{
    int a=10;
    static int b=20;

    static class iner
    {
        int c=30;
        outer ot = new outer();


        void showIner()
        {
            System.out.println("a="+ot.a); //beacuse this class in static and a variable is non static
            System.out.println("b="+b); //b variable is static and outer class veriable direct acess
        }
    }
    void showOuter()
    {
        iner in = new iner();
        in.showIner();

        System.out.println("c="+in.c); // iner class ariable can not direct acess create a obj
    }
}

public class nested1 {
    public static void main(String[] args) {
        outer ot1 = new outer();
        ot1.showOuter();
    }
    
}
