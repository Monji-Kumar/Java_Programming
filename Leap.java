import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        double d=sc.nextDouble();
        float f=sc.nextFloat();
        long l=sc.nextLong();
        char c=sc.next().charAt(0);
        String s=sc.next();
        String s1=sc.nextLine();
        if(yr%400==0||(yr%100!=0&&yr%4==0))
            System.out.println("Leap Year");
        else
            System.out.println("not a Leap Year");
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(c);
        System.out.println(s);
        System.out.println(s1);
        sc.close();
    }
}
