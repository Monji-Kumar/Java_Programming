package Array;

class User {
}

public class ArrayDeclaration{
	public static void main(String[] args) {
		byte [] arr = {1,2,3,4,5,6};
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Length of the Array : "+arr.length);
		System.out.println();
		
		//short
		short [] arr1 = {23,25,26,24,88};
		for (int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		//int
		int [] arr2 = {235,265,243,258,953};
		for (int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		//long
		long [] arr3 = {235894356,4546897256l,3569867125l,6598743254l}; 
		for (int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
			
		//float
		float [] arr4 = {23.2f,2356.5f,5254.5f,6535.5f};
		for (int i=0;i<arr4.length;i++) {
			System.out.print(arr4[i]+" ");
		}
		System.out.println();
		
		//double
		double [] arr5 = {235.56,65398.56,64635.56,89765.256};
		for (int i=0;i<arr5.length;i++) {
			System.out.print(arr5[i]+" ");
		}
		System.out.println();
		
		//char
		char [] arr6 = {'m','o','n','j','i'};
		for (int i=0;i<arr6.length;i++) {
			System.out.print(arr6[i]+" ");
		}
		System.out.println();
		
		//String
		String [] arr7 = {"Manish","Manoj","Pulkit","Yukti"};
		for (int i=0;i<arr7.length;i++) {
			System.out.print(arr7[i]+" ");
		}
		System.out.println();
		
		//Boolean
		boolean [] arr8 = {true,true,false,true,true};
		for (int i=0;i<arr8.length;i++) {
			System.out.print(arr8[i]+" ");
		}
		System.out.println();
		
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		User u4 = new User();
		User u5 = new User();
		User [] arr9 = {u1,u2,u3,u4,u5};
		for (int i=0;i<arr9.length;i++) {
			System.out.print(arr9[i]+" ");
		}
		System.out.println();
	}
}