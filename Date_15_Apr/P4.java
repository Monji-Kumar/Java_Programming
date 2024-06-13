import java.util.Scanner;

public class P4 {
    public static double circle(double r)
    {
        double pi=22.0/7.0;
        return 2*pi*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int num=sc.nextInt();
        System.out.println(circle(num));
        sc.close();
    }
}
