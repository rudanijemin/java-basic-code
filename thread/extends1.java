class extends1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("user thead"+i);
        }
    }
    public static void main(String[] args) {
        extends1 e = new extends1();
        e.start();

        for(int i=0;i<5;i++)
        {
            System.out.println("main thead"+i);
        }        
    }
}
