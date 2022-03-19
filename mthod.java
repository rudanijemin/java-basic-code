class demo{
    int a,b,c;
    void add(int x){
        a=x;
        System.out.println("add="+(a+a));
    }
    void add(int x,int y){
        a=x;
        b=y;
        System.out.println("add="+(a+b));
    }
    void add(int x,int y,int z){
        a=x;
        b=y;
        c=z;
        System.out.println("add="+(a+b+c));
    }
}
public class mthod {
    public static void main(String args[]) {
        demo m1 = new demo();

        m1.add(10);
        m1.add(10,20);
        m1.add(10,30,30);
    }
}
