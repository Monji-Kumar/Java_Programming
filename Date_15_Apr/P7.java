import java.util.Scanner;

public class P7 {
    public static int power(int r,int pow)
    {
        int p=1;
        for(int i=1;i<=pow;i++)
            p*=r;
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print("Enter the power : ");
        int pow=sc.nextInt();
        System.out.println(power(num,pow));
        sc.close();
    }
}
