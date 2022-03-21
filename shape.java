/* find the area of method overloading */

class test{
    void area(int r){
        System.out.println("area of circle"+(3.14*r*r));
    }

    void area(float b){
        System.out.println("area of squre"+(b*b));
    }

    void area(int a,int b){
        System.out.println("area of rectangle"+(a*b));
    }

    void area(int a,float b){
        System.out.println("area of tringle"+(0.5*a*b));
    }

}
public class shape {
    public static void main(String args[]) {
        test t1 = new test();
        t1.area(10);
        t1.area(20, 30);
        t1.area(10.20f);
        t1.area(10,20.30f);
    }
    
}
