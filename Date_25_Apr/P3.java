import java.util.Arrays;

public class P3 {
    public static void main(String[] args) {
        int a[]={10,5,19,90,20};
        for(int i=0;i<a.length-1;i++){
            int mini=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[mini]>a[j]){
                    mini=j;
                }
            }
            int temp=a[i];
            a[i]=a[mini];
            a[mini]=temp;
        }
        System.out.println(Arrays.toString(a));

        for(int i=0;i<a.length-1;i++)
        {
            int mini=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[mini]<a[j])
                    mini=j;
            }
            int temp=a[i];
            a[i]=a[mini];
            a[mini]=temp;
        }
        System.out.println(Arrays.toString(a));
    }   
}
