import java.util.Arrays;
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        char c[]=s.toCharArray();
        char c1[]=s1.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        if(s.length()!=s1.length())
            System.out.println("Not Anagram");
        else{
            int flag=1;
            for(int i=0;i<s.length();i++){
                if(c[i]!=c1[i])
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println("Anagram");
            }
            else
                System.out.println("not Anagram");
        }
    }
}
