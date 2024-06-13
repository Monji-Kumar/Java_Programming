import java.util.Scanner;

public class P2 {
    public static int mpy(int num1,int num2)
    {
        return num1*num2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int num1=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=sc.nextInt();
        System.out.println(mpy(num1, num2));
        sc.close();
    }
}
