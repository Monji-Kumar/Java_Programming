import java.util.Scanner;

public class P9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size=sc.nextInt();
        char c='A';
        for(int i=size;i>=1;i--)
        {
            for(int j=1;j<=i;j++,c++)
                System.out.print(c);
            System.out.println();
        }
        sc.close();
    }
}