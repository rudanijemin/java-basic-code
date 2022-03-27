class test{
    static int count = 0;
    test(){
        count++;
        System.out.println("count= "+count);
    }
    
    
}


public class static1 {
    public static void main(String args[]) {
        test t1 = new test();
        test t2 = new test();
        test t3 = new test();
      
        
    }
    
}
