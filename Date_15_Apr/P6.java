import java.util.Scanner;

public class P6 {
    public static int cube(int r)
    {
        return r*r*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println(cube(num));
        sc.close();
    }
}
