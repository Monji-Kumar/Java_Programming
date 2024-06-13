import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        if((d-(int)d)>=0.5)
            System.out.println((int)d+1);
        else
            System.out.println((int)d);
            sc.close();
    }    
}
