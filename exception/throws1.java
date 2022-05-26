/*throws expation */

class test1
{
    int n1,n2;
    test1(int n1,int n2)
    {
        this.n1=n1;
        this.n2=n2;
    }
    void display()throws ArithmeticException
    {
        int ans=n1/n2;
        System.out.println("ans is ="+ans);
    }
}

public class throws1 {
    public static void main(String[] args) {
        test1 t1 = new test1(10,0);
        try
        {
            t1.display();
        }
        catch(ArithmeticException e)
        {
            System.out.println("divid by zero expation is"+e);

        }

    }
}
