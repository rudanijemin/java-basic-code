class test
{
    synchronized void m1()
    {
        try
        {
            for(int i=0;i<4;i++)
            {
                System.out.println("good");
                Thread.sleep(1000);
                System.out.println("morning");
            }
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class sync extends Thread
{
    test t;
    sync(test t)
    {
        this.t=t;
    }
    public void run()
    {
        t.m1();
    }
}

class synchro1 
{
    public static void main(String[] args) {
        test t1 = new test();
        sync s1 = new sync(t1);
        sync s2 = new sync(t1);
    
        s1.start();
        s2.start();
        
    }



}
