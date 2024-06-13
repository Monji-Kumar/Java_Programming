import java.util.Scanner;

public class PrimeSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Lower Limit : ");
        int llimit=sc.nextInt();
        System.out.print("Enter Upper Limit : ");
        int ulimit=sc.nextInt();
        sc.close();
        for(int i=llimit;i<=ulimit;i++)
        {
            int flag=1;
            for(int j=2;j<i;j++) 
            {
                if(i%j==0&&i!=1&&i!=2)
                {
                    flag=0;
                    break;
                }
            }
            if(i==2)
                System.out.print(i+" ");
            if(flag==1&&i!=1&&i!=2)
                System.out.print(i+" ");
        }
    }
}