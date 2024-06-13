import java.util.Scanner;

public class P1{
    public static int count(int num){
        int ctr=0;
        while(num>0){
            ctr++;
            num/=10;
        }
        return ctr;

    }
    public static boolean isArmStrong(int num){
        int c=count(num);
        int sum=0;
        int temp=num;
        while(num>0){
            int p=1;
            for(int i=1;i<=c;i++){
                p*=(num%10);
            }
            sum+=p;
            num/=10;
        }
        if(sum==temp)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        boolean b=isArmStrong(num);
        if(b)
        {
            System.out.println("The "+num+" is an Armstrong Number");
        }
        else{
            System.out.println("The "+num+" is not an Armstrong Number");
        }
        sc.close();
    }
}