import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Limit : ");
        int num=sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<=num;i++){
            if(i==1)
                System.out.print(a+" ");
            else if(i==2)
                System.out.print(b+" ");
            else
            {
                System.out.print(a+b+" ");
                int temp=b;
                b=a+b;
                a=temp;
            }
        }
    }    
}
