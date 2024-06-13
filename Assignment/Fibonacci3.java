import java.util.Scanner;

public class Fibonacci3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Limit : ");
        int num=sc.nextInt();
        int a=0,b=1,ctr=0;
        for(int i=1;ctr<num;i++){
		int temp=a+b;
                if(temp%2!=0){
                    System.out.println(temp);ctr++;}
                a=b;
		b=temp;
        }
    }    
}
