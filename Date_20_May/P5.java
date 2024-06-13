public class P5 {
    public static void main(String[] args) {
        String s="Hola!!";
        String pwd="Ghola!!";
        try{
        if(!s.equals(pwd)){
            throw new P4() ;
        }
        }catch(P4 p){
            System.out.println(p.getMessage());
        }
    }
}
