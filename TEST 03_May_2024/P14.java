import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("enter the size of array");
      int size = s.nextInt();
      int a[] = new int[size];
      System.out.println("enter the elements of array");
      for(int i=0;i<a.length;i++){
         a[i] = s.nextInt();
      }
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                for(int j=i;j<a.length-1;j++)
                    a[j]=a[j+1];
                a[a.length-1]=0;
            }
        }
        System.out.println("new array is:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}