import java.io.*;

/*read consol bis(buffer inpput stream) */

public class readfromFIS {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("abc.txt");
        
        int i;
        while((i=fis.read())!=-1)
        {
            System.out.print((char)i);
        }
       ;
    }
    
}
