import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum==num)
            System.out.println("Perfect");
        else
            System.out.println("Not Perfect");
    }
}
