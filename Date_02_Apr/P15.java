import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%8==0)
            System.out.println("The number is a multiple of 8");
        else    
            System.out.println("The number is not a multiple of 8");
            sc.close();
    }
}
