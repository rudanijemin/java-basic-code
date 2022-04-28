public class join1 extends Thread
{
    public void run()
    {
        String s = Thread.currentThread().getName();

        for(int i=0;i<5;i++)
        {
            System.out.println("user thead"+i+s);
            
        }
    }    
     public static void main(String[] args) {
        join1 j =new join1();
        join1 j1 =new join1();
        join1 j2 =new join1();

        j.setName("jemin");
        j1.setName("banshil");
        j2.setName("vaidik");

        System.out.println(j1.isAlive());
        j1.start();
        try
        {
            System.out.println(j1.isAlive());
            j1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        j.start();
        j2.start();

    }
}
