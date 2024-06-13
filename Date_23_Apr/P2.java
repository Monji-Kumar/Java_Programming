public class P2 {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b[]={60,50,40,30,20,10};
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
            c[i]=a[i];
        for(int i=a.length,j=0;i<a.length+b.length;i++,j++)
            c[i]=b[j];
        for(int i=0;i<a.length+b.length;i++)
            System.out.print(c[i]+" ");
    }    
}
