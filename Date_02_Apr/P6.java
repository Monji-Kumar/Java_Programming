import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c>='A'&&c<='Z')
            System.out.println("The character is an UpperCase Alphabet");
        else if(c>='a'&&c<='z')
            System.out.println("The Character is a LowerCase Alphabet");
        else
            System.out.println("The Character is not an Alphabet");
            sc.close();
    }    
}
