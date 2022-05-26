import java.io.BufferedInputStream;

/*read consol bis(buffer inpput stream) */

public class readfromBIS {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        char c =(char)bis.read();
        System.out.println(c);
    }
    
}
