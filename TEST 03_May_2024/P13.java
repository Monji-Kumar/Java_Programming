import java.util.Arrays;
import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={-1,-100,3,99};
        int k=sc.nextInt();
        for(int i=1;i<=k;i++){
            int temp=a[a.length-1];
            for(int j=a.length-1;j>0;j--)
                a[j]=a[j-1];
            a[0]=temp;
        }
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
