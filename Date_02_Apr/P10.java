import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
            System.out.println("The number is even");
        else
            System.out.println("The number is Odd");
            sc.close();
    }   
}