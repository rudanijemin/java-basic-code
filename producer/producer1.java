class procon
{
    boolean isMarked = false;
    int data;

    synchronized void produce(int n)
    {
        if(isMarked)
        {
            try
            {
                wait();
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        data=n;
        System.out.println("i am producing data="+data);
        isMarked = true;
        notify();
    }

    
    synchronized void consume()
    {
        if(!isMarked)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        System.out.println("i am consuming data="+data);
        isMarked = false;
        notify();
    }
}

class producer extends Thread
{
    procon pc;
    producer(procon pc)
    {
        this.pc = pc;
        start();
    }
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            pc.produce(i);
        }    
    }
}

class consumer extends Thread
{
    procon pc;
    consumer(procon pc)
    {
        this.pc = pc;
        start();
    }
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            pc.consume();
        }    
    }
}



class producer1
{
    public static void main(String[] args) {
        procon pc = new procon();
        producer p = new producer(pc);
        consumer c = new consumer(pc);

    }
    
}
