import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        int a[]={10,15,90,5,20};
        int k=0;
        while(k<a.length){
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]<a[i])
            {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }k++;}
        System.out.println(Arrays.toString(a));
    }
}
