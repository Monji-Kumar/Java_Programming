public class P17 {
    public static void main(String[] args) {
        char c='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j==1||j==5||i==1||i==5){
                System.out.print(c);c++;}
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
