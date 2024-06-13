package Date_05_Apr;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=10;i<=n*10;i+=10)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }
}
