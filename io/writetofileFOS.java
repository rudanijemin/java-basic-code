import java.io.*;

/*read consol bis(buffer inpput stream) */

public class writetofileFOS {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("jemin.txt");

        String s = "hello rudani ";
        byte b[]= s.getBytes();
        fos.write(b);
        fos.close();
    
    }
    
}

