import java.io.*;

/*throw expation */

class test
{
    int n;
    void textexpation()throws IOException
    {
        if(n==5)
        {
            throw new IOException();
        }
        else{
            System.out.println("n="+n);
        }
    }
}
public class throw1 {
    public static void main(String[] args) {
        test t=new test();
        t.n=Integer.parseInt(args[0]);
        try
        {
            t.textexpation();
        }
        catch(IOException e)
        {
            System.out.println(e);

        }
    }
    
}
