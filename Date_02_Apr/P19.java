import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int wid=sc.nextInt();
        int area=len*wid;
        System.out.println("The area of rectangle is : "+area);
        sc.close();
    }    
}
