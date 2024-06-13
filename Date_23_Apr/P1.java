import java.util.Scanner;

public class P1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit of Array : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int b[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            b[a.length-i-1]=a[i];
        }
        for (int i : b) {
            System.out.print(i+" ");
        }
    }
}