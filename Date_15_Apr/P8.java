import java.util.Scanner;

public class P8 {
    public static boolean isPrime(int n)
    {
        int flag=1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
    public static void numgen(int n)
    {
        int ctr=0,i=2;
        if(n==1)
            System.out.println(2);
        else{
            
        for(;ctr!=n;i++)
        {
            if(isPrime(i))
                ctr++;
        }
    }
    System.out.println(i-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        numgen(num);
        sc.close();
    }
}
