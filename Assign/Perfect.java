package Array;

public class Perfect {

    public static void perfect(int  num1){
     int num2=num1,perfect=0 ;
		for(int a =1; a<=num2/2;a++)
		{
			if(num1%a==0)
			perfect +=a;
		}
		if(num1==perfect)
		System.out.println(num1+ " is an perfect number");
		else
	   	System.out.println(num1+ " is not an perfect number");	   
    
    }
    public static void mnPerfect(int m , int n){
        int no_perfect=0;
		for(int a =m;a<=n;a++)
		{
			int num1=a,num2=a,perfect=0;
			for(int b =1; b<=a/2;b++)
			{
				if(a%b==0)
				perfect+=a;
			}
			if(num1==perfect)
			{
				//System.out.println(perfect);
				no_perfect++;
			}
		}
		System.out.println(no_perfect);
    }
    public static void main(String [] args){
        perfect(33550336);
        mnPerfect(1, 1000);
	}
}
