public class name1 extends Thread
{

    public void run()
    {
        Thread t = Thread.currentThread();
        t.setName("raj");
        System.out.println("user thread"+t);
    }
    public static void main(String[] args) {

        Thread t1 = Thread.currentThread();
        t1.setName("ram");
        
        System.out.println("main thread "+t1);
        name1 td = new name1();
        td.start();
      


        

    

        
    }
    
}

