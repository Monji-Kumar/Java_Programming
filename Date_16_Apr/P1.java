import java.util.Scanner;

public class P1{
    public static int count(int num)
    {
        int ctr=0;
        while(num>0)
        {
            ctr++;
            num/=10;
        }
        return ctr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("The number of digits in "+num+" is : "+count(num));
    }
}