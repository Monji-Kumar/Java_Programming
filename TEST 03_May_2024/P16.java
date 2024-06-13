import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        String s = s1+" ";
        String rev="";
        String wrd = "";
        for(int i = 0; i<s.length();i++){
            
            if(s.charAt(i)==' '){
                rev = wrd+" "+rev;
                wrd = "";
            }
            else{
                wrd = wrd+s.charAt(i);
            }
        }
        
        System.out.println(rev);
        sc.close();
    }
}