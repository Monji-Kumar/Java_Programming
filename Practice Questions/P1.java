public class P1{
    public static void main(String[] args) {
        String s1="Manish is a bad Boy";
        char c[]=s1.toCharArray();
        for(int k=1;k<=2;k++){
            char temp=c[0];
        for(int i=0;i<c.length-1;i++){
            c[i]=c[i+1];
        }
        c[c.length-1]=temp;
        }
        String s2=new String(c);
        System.out.println(s2);
    }
}