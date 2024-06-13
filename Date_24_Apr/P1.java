//import java.util.Scanner;
import java.util.Arrays;
public class P1 {

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        int b[]={10,20,30,40};
        int c[]=new int[a.length+b.length];
        int sum=0;
        for(int i=0,j=0,k=0;i<a.length+b.length;i++)
        {
            if(i%2==0&&j<a.length){
                c[i]=a[j];j++;sum+=c[i];
            }
            else if(k<b.length)
                {c[i]=b[k];k++;sum+=c[i];}
        }
            System.out.println(Arrays.toString(c));
            System.out.println(sum);
    }
}