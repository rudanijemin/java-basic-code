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

public class testdemo3 {
    public static void main(String args[]) {

        Test t1 = new Test();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value m1");
        int p = sc.nextInt();

        System.out.println("Enter value m2");
        int q = sc.nextInt();

        t1.setData(p, q);
        t1.getData(); 

        int ch;
        do{

            System.out.println("enter your choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    int ans = t1.sum();
                    System.out.println("sum="+ans);
                break;

                case 2:
                    int sub = t1.sub();
                    System.out.println("subtraction="+sub);
                break;

                case 3:
                    int mul = t1.mul();
                    System.out.println("multipy="+mul);
                break;

                case 4:
                    double div = t1.div();
                    System.out.println("divition="+div);
                break;
            
                default:
                    System.out.println("enter number is not valid");
                break;
            } 
        }while(ch!=5);

    }
    
}
