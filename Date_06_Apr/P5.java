import java.util.Scanner;

public class P5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size=sc.nextInt();
        for(int i=size;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}