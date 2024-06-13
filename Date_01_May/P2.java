public class P2{
    public static void main(String[] args) {
        String s="Qspiders@gmail.com";
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
       // System.out.println(temp);
       System.out.println(s.substring(0,s.indexOf('@'))); 
       System.out.println(s.substring(s.indexOf(s.charAt(0)),s.indexOf('@')));
       System.out.println(s.substring(s.indexOf('@')+1,s.indexOf('.')));
    }
}