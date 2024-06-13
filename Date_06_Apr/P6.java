import java.util.Scanner;

public class P6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size=sc.nextInt();
        int k=size-1;
        for(int i=1;i<=size;i++)
        {
            for(k=size-1;k>=i;k--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
 {
 }}
