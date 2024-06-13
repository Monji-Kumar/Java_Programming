import java.util.Scanner;

public class P12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size=sc.nextInt();
        int p=2;
        for(int i=size;i>=1;i--)
        {
            for(int k=1;k<=size-i;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}