import java.util.Scanner;

public class P104{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter limit : ");
        size=sc.nextInt();
        int b[]=new int[size];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j])
                    System.out.println(a[i]);
            }
        }
        
    }
}