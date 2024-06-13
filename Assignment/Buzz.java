import java.util.Scanner;

public class Buzz {
    public static boolean buzz(int num)
    {
        int temp=num;
        if(num%7==0)
            return true;
        while(temp>0)
        {
            int a=temp%10;
            if(a==7)
                return true;
            temp/=10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean b=buzz(num);
        if(b)
            System.out.println("Buzz Number");
        else
            System.out.println("Not Buzz");
    }
}
