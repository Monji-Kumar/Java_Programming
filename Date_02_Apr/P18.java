import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println((num>0)?"The number is +ve":"The number is -ve");
        sc.close();
    }    
}
