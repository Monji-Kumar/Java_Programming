public class P2 {
    public static void main(String[] args) {
        String s="Java";
        char c[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int flag=1;
        for(int i=0;i<c.length;i++){
            flag=1;
            for(int j=0;j<s.length();j++){
                if(c[i]==s.charAt(j))
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                break;
        }
        if(flag==0){
            System.out.println("panagram");}
        else
            System.out.println("Not panagram");
        }
    }
