public class a extends Thread {
    public void run()
    { 
        for(int i=0;i<3;i++)
        {
            System.out.println("good");
            System.out.println("morning");
        }
       
    }
    public static void main(String[] args) {
        a b = new a();
        b.start();
    }
  
    
}
