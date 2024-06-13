import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        int a=0;int b=1;
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        if(l==1)
            System.out.print(a+" ");
        else if(l==2)
            System.out.print(a+" "+ b);
        else
        {
            for(int i=1;i<=l;i++)
            {
                if(i==1)
                    System.out.print(a+" "); 
                else if(i==2)
                    System.out.print(b+" ");
                else{
                    int temp=b;
                    b=a+b;
                    a=temp;
                    System.out.print(b+" ");

                }     
            }
        }
    }    
}
