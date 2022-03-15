import java.util.*;
class Test{
    int m1,m2;
    void setData(int a,int b)
    {
        m1=a;
        m2=b;
    }

    void getData()
    {
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
    }
}

public class testdemo {
    public static void main(String args[]) {

        Test t1 = new Test();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value m1");
        int p = sc.nextInt();

        System.out.println("Enter value m2");
        int q = sc.nextInt();

        t1.setData(p, q);
        t1.getData();    
    }
    
}
