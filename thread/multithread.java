
import java.util.*;

class one implements Runnable{
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("good morning"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class two implements Runnable{
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("good afternoon"+i);
                Thread.sleep(3000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class multithread {
    public static void main(String[] args) {
        one on = new one();
        two tw = new two();

        Thread t = new Thread(on);
        Thread t1 = new Thread(tw);

        t.start();
        t1.start();
    
    
    }


    
}
