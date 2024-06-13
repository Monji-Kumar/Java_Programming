import java.util.Scanner;

public class P3 {
    public static double circle(double r)
    {
        double pi=22.0/7.0;
        return pi*r*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int num=sc.nextInt();
        System.out.println(circle(num));
        sc.close();
    }
}
