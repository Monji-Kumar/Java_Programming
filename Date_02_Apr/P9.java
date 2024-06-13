import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%6==0)
            System.out.println("The number is Divisible by 6");
        else    
            System.out.println("The number is not divisible by 6");
            sc.close();
    }    
}
