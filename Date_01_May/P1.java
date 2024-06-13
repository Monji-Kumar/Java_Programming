public class P1{
    public static void main(String[] args) {
        String s="kl klsdjhf aakjsgdfkjhgwei fjkdjfa";
        String temp="";
        boolean b=false;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='a')
            {
                b=true;
            }
            if(b==true)
            {
                temp=temp+s.charAt(i);
            }
        }
        System.out.println(temp);
        System.out.println(s.substring(s.indexOf('a'),s.indexOf('e')));
    }
}