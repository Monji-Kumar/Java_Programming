import java.util.Scanner;

public class P5 {
    public static int square(int r)
    {
        return r*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println(square(num));
        sc.close();
    }
}
