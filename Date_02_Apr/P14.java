import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((a>b)?((a>c)?"First Number is Bigger":"Third Number is Greatest"):((b>c)?"Second Number is the greatest":"Third Number is greatest"));
        sc.close();
    }    
}
