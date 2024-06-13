//import java.util.Scanner;
import java.util.Arrays;
public class P3 {

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50,0};
        int mini=a[0];
        for(int i=0;i<a.length;i++)
        {
           if(a[i]<mini)
            mini=a[i];
        }
            System.out.println(Arrays.toString(a));
            System.out.println(mini);
    }
}