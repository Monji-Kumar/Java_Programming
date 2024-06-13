import java.util.Scanner;
public class Palindrone{
    public static boolean pal(int num){
        int temp=num,p=0;
        while(num>0){
            p=p*10+num%10;
            num/=10;
        }
        if(temp==p)
            return true;
        else    
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        boolean b=pal(num);
        if(b)
            System.out.println("Palindrone");
        else
            System.out.println("Not Palindrone");
        sc.close();
    }
}