package Array;

public class oddDigit {
    public static void startOddEven(int num){
        int count=0,temp=0;;
        for(;num!=0;num/=10,count++){
            temp = num%10;
        }
        if(temp%2==0)
            System.out.println("Number starts with Even number");
        else
        System.out.println("Number starts with Odd number");
    }
    public static void main(String[] args) {
        startOddEven(123);
    }
}
