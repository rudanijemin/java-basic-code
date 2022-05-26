import java.io.*;

/*read from consol using buffer reading only single line */

public class readfromBR1{
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter data");

        String s = br.readLine();
        System.out.println(s);
        
    
    }
    
}


