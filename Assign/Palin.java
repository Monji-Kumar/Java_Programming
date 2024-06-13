package Array;

public class Palin {
    public static void main(String [] args){
	{
		int num = 121,temp = num,palin=0;
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
		System.out.println("=====================");

		int m=1,n=1000,no_palin=0 ;
		
		for(int a =m;a<=n;a++)
		{	
			int temp=a,temp1=a, palin=0;
			for(;temp>0;temp/=10)
			{
				int temp2 = temp%10;
				palin = palin*10+temp2;
			}
			if(a==palin)
			no_palin++;
		}
		System.out.println(no_palin);
	}
}
