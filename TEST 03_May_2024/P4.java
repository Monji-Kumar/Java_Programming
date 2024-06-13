public class P4 {

	public static void patterns(int num)
	  {
	   for(int i=num;i>1;i--)
	   {
	     for(int j=num-i;j>0;j--)
	     {
	        System.out.print(" ");
	      }
	     for(int j=i;j>0;j--)
	     {
	    	 if (j==1||j==i||i==num) {
	    		 System.out.print("* ");	
			}else {
				System.out.print("  ");
			}
	        
	      }
	     if (i!=2) {
	    	 System.out.println();
		}
	    
	   }
	   for(int i=0;i<=num;i++)
	   {
	     for(int j=0;j<num-i;j++)
	     {
	        System.out.print(" ");
	      }
	     for(int j=0;j<i;j++)
	     {
	       if (i==num||j==i-1||j==0) {
	    	   System.out.print("* ");
		}else {
			System.out.print("  ");
		}
	    	
	      }
	    System.out.println();
	   }
	  }
	public static void main(String[] args) {
		patterns(4);
	}
}