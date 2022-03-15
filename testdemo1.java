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
    int sum()
    {
        int i = m1+m2;
        return i;
    }
    int sub()
    {
        int i = m1-m2;
        return i;
    }
    int mul()
    {
        int i = m1*m2;
        return i;
    }
    double div()
    {
        int i = m1/m2;
        return i;
    }
}

public class testdemo1 {
    public static void main(String args[]) {

        Test t1 = new Test();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value m1");
        int p = sc.nextInt();

        System.out.println("Enter value m2");
        int q = sc.nextInt();

        t1.setData(p, q);
        t1.getData(); 
        
        int ans = t1.sum();
        System.out.println("sum="+ans);

        int  sub = t1.sub();
        System.out.println("subtraction="+sub);

        int mul = t1.mul();
        System.out.println("multipy="+mul);

        double div = t1.div();
        System.out.println("division="+div);

    }
    
}
