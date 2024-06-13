public class P5 {
    public static void main(String[] args) {
        
    char c[]={'n','i','t','i','n'};
    int flag=0;
    for(int i=0,j=c.length-1;i<c.length/2;i++,j--){
        if(c[i]!=c[j])
        {
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        System.out.println("Palindrone");
    }
    else
    {
        System.out.println("not Palindrone");
    }}
}
