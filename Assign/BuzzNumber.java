package Array;

public class BuzzNumber {
    public static void buzzNumber(int num){
        if(num%7==0|| num%10==7)
            System.out.println("Number is an buzz number");
        else
            System.out.println("Number is not an buzz number");        
    }
    public static void main(String[] args) {
        buzzNumber(1237);
    }
}
