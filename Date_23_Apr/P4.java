public class P4 {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        for(int i=0,j=a.length-1;i<a.length/2;i++,j--){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }   
}
