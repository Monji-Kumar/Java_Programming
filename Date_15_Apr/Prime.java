import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        int flag=1;
        if(num==1)
            System.out.println("The "+num+" is neither prime not composite");
        else if(num==2)
            System.out.println("The "+num+" is prime");
            else{
                for(int i=2;i<num;i++)
                {
                    if(num%i==0){
                        flag=0;
                        break;
                    }
                }
            }
        if(flag==1)
            System.out.println("The "+num+" is Prime");
        else
            System.out.println("The "+num+" is not Prime");
            sc.close();
    }
}
