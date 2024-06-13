public class P15 {
    public static void main(String[] args) {
        String s="edited";
        if(s.length()<=2)
            System.out.println("true");
        else if(s.substring(0,2).equals(s.substring(s.length()-2)))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
