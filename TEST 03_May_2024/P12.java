import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                sum+=s.charAt(i)-48;
            }
        }
        System.out.println();

        System.out.println(sum);
    }    
}
