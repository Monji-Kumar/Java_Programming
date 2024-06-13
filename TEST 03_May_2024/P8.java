import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                s1.append(s.charAt(i));
            }
        }
        String s2=new String(s1);
        int flag=1;
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            if(s1.charAt(i)!=s1.charAt(j))
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println("Palindrone");
    }
}
