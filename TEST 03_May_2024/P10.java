import java.util.Arrays;

public class P10 {
    public static void main(String[] args) {
        int a[]={-1,0,3,5,9,12};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int start=0,end=a.length-1,index=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==30){
                index=mid;
                break;}
            else if(a[mid]>30)
                end=mid-1;
            else
                start=mid+1;
        }
        System.out.println(index);
    }
}
