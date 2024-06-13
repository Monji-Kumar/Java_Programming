import java.util.Scanner;

public class P2{

    public static void main(String[] args) {
        String [] s=new String[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
            s[i]=sc.nextLine();
        System.out.println(s[1]);
        sc.close();
    }
}