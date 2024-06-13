import java.util.LinkedHashMap;

public class P1{
    public static void main(String[] args) {
        LinkedHashMap<Character,Integer> l=new LinkedHashMap<Character,Integer>();
        String s="javaprogram";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(c==s.charAt(j))
                    count++;
            }
            l.put(s.charAt(i),count);
        }
        System.out.println(l.entrySet());
    }
}