import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double attendance=sc.nextDouble();
        if(attendance>=75)
            System.out.println("Eligible for Exams");
        else
            System.out.println("Not eligible for exams");
            sc.close();
    }    
}
