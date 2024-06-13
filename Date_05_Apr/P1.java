package Date_05_Apr;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print(i);
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
