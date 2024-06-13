import java.util.Scanner;

public class P1 {
    public static String number(int num)
    {
        if(num%2==0)
            return "Even";
        else
            return "Odd";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        System.out.println(number(num));
        sc.close();
    }
}
