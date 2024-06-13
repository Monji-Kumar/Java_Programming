import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int flag=0;
        s=s.toLowerCase();
        for(char c='a';c<='z';c++){
            for(int i=0;i<s.length();i++){
                if(c==s.charAt(i))
                {
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
            }
            if(flag==0)
                break;
        }
        if(flag==1)
            System.out.println("Panagram");
        else
            System.out.println("Not Panagram");
        sc.close();
    }
}
