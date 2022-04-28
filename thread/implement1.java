class implement1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("user thead"+i);
        }
    }
    public static void main(String[] args) {
        implement1 e = new implement1();
        Thread t = new Thread(e);
        t.start();

        for(int i=0;i<5;i++)
        {
            System.out.println("main thead"+i);
        }        
    }
}
