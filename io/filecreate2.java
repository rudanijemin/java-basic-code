/*file creation */

import java.io.*;

public class filecreate2
{
    public static void main(String[] args)  {
        try{
            File f = new File("abc.txt");
            if(f.createNewFile())
            {
                System.out.println("new file created");
            }
            else{
                System.out.println("file is already exists");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
    


