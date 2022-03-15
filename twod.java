import java.util.*;
public class twod {
    public static void main(String args[]) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];

        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println("enter values");
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(arr[i][j]);
                
            }
           
        }
    }
}
