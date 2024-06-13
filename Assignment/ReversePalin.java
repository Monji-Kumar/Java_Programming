public class ReversePalin{
    public static void palin(int num){
        int temp = num,palin=0;
		for(;num>0;num/=10)
		{	
			int temp1 = num%10;
			palin =palin*10 + temp1;	
		}
		if(temp == palin)
		System.out.println(temp +" is an Palindrome number");
		else
		System.out.println(temp +" is not an Palindrome number");
    }

    public static void reverse(int num){
        int temp = num,palin=0;
		for(;num>0;num/=10)
		{	
			int temp1 = num%10;
			palin =palin*10+ temp1;	
		}
        palin(palin);
        System.out.println(palin);
    }
    public static void main(String[] args) {
        reverse(143);
    }
}