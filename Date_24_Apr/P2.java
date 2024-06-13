//import java.util.Scanner;
import java.util.Arrays;
public class P2 {

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50,0,0};
        int j=a.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j--;
            }
        }
            System.out.print(Arrays.toString(a));
    }
}