import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
            System.out.println("First Number is bigger");
        else if(b>a)
            System.out.println("Second number is bigger");
        else
            System.out.println("Both numbers are equal");
            sc.close();
    }    
}
