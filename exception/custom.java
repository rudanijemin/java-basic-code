import javax.lang.model.util.ElementScanner6;
import java.io.*;

class agecheck extends Exception
{
    agecheck()
    {
        System.out.println();
    }
}


public class custom {
    public static void main(String[] args) {
        agecheck ac = new agecheck();

        try{
            if(Integer.parseInt(args[0])>18)
            {
                throw new agecheck("vaction are available");
            }
            else if(Integer.parseInt(args[0])>11 && Integer.parseInt(args[0])<16)
            {
                {
                    throw new agecheck("vaction are available in june");
                }
            }
            else
            {
                throw new agecheck("vaction are not available");   
            }
        }
        catch(agecheck e)
        {
            System.out.println(e);
        }
    }
    
}
