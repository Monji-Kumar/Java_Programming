public class P3 {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int b[]=new int[a.length];
        for(int i=a.length-1,j=0;i>=0;j++,i--){
            b[i]=a[j];
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }   
}
