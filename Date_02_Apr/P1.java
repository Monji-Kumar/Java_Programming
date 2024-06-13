//package Date_02_Apr;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter Age of First Person : ");
        a=sc.nextInt();
        System.out.print("Enter Age of Second Person : ");
        b=sc.nextInt();
        System.out.print("Enter Age of Third Person : ");
        c=sc.nextInt();
        if(a>b&&a>c)
            System.out.println("First person is the eldest");
        else if(b>c&&b>a)
            System.out.println("Second person is the eldest");
        else
            System.out.println("Third person is the eldest");
        sc.close();
    }
}
