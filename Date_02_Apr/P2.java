import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c=sc.next().charAt(0);
        if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
            System.out.println("The character is an Alphabet");
        else if(c>='0'&&c<='9')
            System.out.println("The Character is a Number");
        else
            System.out.println("The Character is a Special Character");
        sc.close();
    }
    
}
