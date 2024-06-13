//import java.util.Scanner;
import java.util.Arrays;
public class P4 {

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        int num=2;
        for(int j=1;j<=num;j++){
            int temp=a[a.length-1];
            for(int i=a.length-1;i>0;i--)
        {
                a[i]=a[i-1];
        }
         a[0]=temp;
    }
            System.out.println(Arrays.toString(a));
    }
}