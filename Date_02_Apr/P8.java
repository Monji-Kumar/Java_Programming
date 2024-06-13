import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        double salary=sc.nextDouble();
        double bonus;
        if(yr>=5)
        {
            bonus=(double)(salary)*((double)yr/100);
            System.out.println("The bonus of the employee is : "+bonus);
        }
        else
            System.out.println("No Bonus");
        sc.close();
    }    
}
