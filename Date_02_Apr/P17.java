import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0)
            System.out.println("The number "+num+" is positive");
        else if(num<0)
            System.out.println("The number "+num+" is negative");
        else
            System.out.println("The number "+num+" is neither +ve nor -ve");
            sc.close();
    }    
}
