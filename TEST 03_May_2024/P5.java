import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s;
        System.out.println("The count of Each Character in "+s+" is");
        for(int i=0;i<s.length();i++){
            int ctr=0;
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++){
                if(ch==s1.charAt(j))
                    ctr++;
            }
            System.out.println(ch+"->"+ctr);
        }
    }
}
