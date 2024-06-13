import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0&&num%3==0)
            System.out.println("The Number is a multiple of 5 and 3");
        else if(num%5==0&&num%3!=0)
            System.out.println("The number is a multiple of 5 only");
        else if(num%5!=0&&num%3==0)
            System.out.println("The number is a multiple of 3 only");
        else
            System.out.println("The number is not a multiple of 5 and 3");
            sc.close();
    }
}
