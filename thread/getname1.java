/*getname */

public class getname1 extends Thread
{

    public void run()
    {
        System.out.println("user thread :"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        getname1 td = new getname1();
        td.setName("jemin");
        td.setPriority(5);
        td.start();

        getname1 td1 = new getname1();
        td1.setName("jaydip");
        td1.setPriority(10);
        td1.start();
    }
 
}
