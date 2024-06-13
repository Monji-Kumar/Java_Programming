import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length,width;
        length=sc.nextInt();
        width=sc.nextInt();
        if(length==width)
            System.out.println("The values of sides given are of a square");
        else
            System.out.println("The Values of sides given are of a rectangle");
        sc.close();
    }    
}
