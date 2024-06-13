import java.util.Arrays;
import java.util.Scanner;

public class P2 {
    public static int fact(int num){
        int f=1;
        for(int i=num;i>0;i--)
        {
            f*=i;
        }
        return f;
    }
    public static boolean isStrong(int num){
        int sum=0,temp=num;
        while(temp>0){
            sum+=fact(temp%10);
            temp/=10;
        }
        if(sum==num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.print("Enter the Array elements : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The input Array is : "+Arrays.toString(a));
        System.out.print("The Strong Numbers in the given arrays is : [");
        for(int i=0;i<a.length;i++){
            boolean b=isStrong(a[i]);
            if(b)
                System.out.print(a[i]+", ");
        }
        System.out.print("]");
        sc.close();
    }    
}
