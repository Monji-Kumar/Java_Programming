public class P15 {
    public static void main(String[] args) {
        /* 1
         * 26
         * 3710
         * 481113
         * 59121415
         */
        int k=1;
        for(int i=1;i<=5;i++)
        {
            k=i;
            for(int j=1;j<=i;j++)
            {
                if(j==1){
                System.out.print(i);}
                else{
                    k+=6-j;
                System.out.print(k);}
            }
            System.out.println();
        }
    }
}
