import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Limit : ");
        int num=sc.nextInt();
        int a=0,b=1,ctr=0;
        for(int i=1;i<=num;i++){
            if(i==1){
                ctr++;
                if(ctr==num){
                System.out.println(a);break;}
            }
            else if(i==2)
                ctr++;
            else
            {
                ctr++;
                int temp=b;
                b=a+b;
                a=temp;
            }
            if(ctr==num)
                System.out.println(b);
        }
    }    
}
