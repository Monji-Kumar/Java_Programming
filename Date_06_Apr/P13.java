public class P13 {
    public static void main(String[] args) {
        char c='A';
        for(int i=1;i<=5;i++,c+=4){
            for(int j=1;j<=i;j++,c++)
            {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
