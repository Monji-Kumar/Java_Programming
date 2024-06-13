package Array;

public class Fib {

    public static void fib(){
        int first_term = 0,  second_term = 1, next_term=0;
        while(next_term<100){
             next_term = first_term+second_term;
            System.out.println(next_term);
            first_term= second_term;
            second_term= next_term;
        }
    }

    public static void kFib(int k){
        int first_term = 0,  second_term = 1, next_term=0;
        int count=0;
        while(count!=k){
            next_term = first_term+second_term;
            first_term = second_term;
            second_term = next_term;
            count++;
        }
        System.out.println(next_term);
    }

    public static void oddFib(){
        int first_term = 0,  second_term = 1, next_term=0;
        while(next_term<100){
            next_term = first_term+second_term;
            if(next_term%2!=0)
                 System.out.println(next_term);
            first_term= second_term;
            second_term= next_term;
        }
    }
    public static void main(String[] args) {
        fib();
        kFib(6);
        oddFib();
    }
}
