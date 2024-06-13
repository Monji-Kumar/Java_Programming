import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((a>b)?"First Number is Bigger":"Second Number is Bigger");
        sc.close();
    }    
}
