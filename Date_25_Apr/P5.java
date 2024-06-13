import java.util.Arrays;

public class P5 {
    //first sort the array
    public static void main(String[] args) {
        int a[]={1,9,5,8,7,4,6,2,3};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        int start=0;
        int end=a.length-1;
        int num=1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num==a[mid]){
                System.out.println("found");break;}
            else if(num>a[mid])
            {
                start=mid+1;
            }
            else
                end=mid-1;
        }
    }
}
