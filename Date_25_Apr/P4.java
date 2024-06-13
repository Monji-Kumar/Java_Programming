import java.util.Arrays;

public class P4 {
    public static void main(String[] args) {
        int a[]={10,60,40,20,50};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[j]>a[i])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(a[2]);
        System.out.println(Arrays.toString(a));
    }
}
