class sleep1 extends Thread
{
    public void run()
    {
        Thread t=Thread.currentThread();
        t.setName("jemin");
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("user thead"+i+t);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        sleep1 e = new sleep1();
        e.start();


        try
        {
            for(int i=0;i<5;i++)
            {
                Thread.sleep(1000);
                System.out.println("main thead"+i);
            } 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
              
    }
}
