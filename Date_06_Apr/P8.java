import java.util.Scanner;

public class P8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                    System.out.print(0);
                else    
                    System.out.print(1);
            }
            System.out.println();
        }
        sc.close();
    }
}