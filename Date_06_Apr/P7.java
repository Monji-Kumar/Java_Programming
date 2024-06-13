import java.util.Scanner;

public class P7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size=sc.nextInt();
        int k=1;
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=i;j++,k++)
                System.out.print(k);
            System.out.println();
        }
        sc.close();
    }
}