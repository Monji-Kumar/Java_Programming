//import java.util.Scanner;
import java.util.Arrays;
public class P5 {

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        int num=2;
        for(int j=1;j<=num;j++){
            int temp=a[0];
            for(int i=0;i<a.length-1;i++)
        {
                a[i]=a[i+1];
        }
         a[a.length-1]=temp;
    }
            System.out.println(Arrays.toString(a));
    }
}