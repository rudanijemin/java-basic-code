class sleep2 extends Thread
{
    public void run()
    {
       
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("good "+i);
                Thread.sleep(1000);
                System.out.println(" mornig"+i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        sleep2 e1 = new sleep2();
        e1.start();


              
    }
}

