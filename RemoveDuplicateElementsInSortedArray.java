/*import java.util.*;
class RemoveDuplicateElementsInSortedArray{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);


		System.out.println("Enter the array size");
		int n=sc.nextInt();

		int a[]=new int[n];


	    System.out.println("Enter the array Elements");
	    for(int i=0;i<n;i++){
	    	a[i]=sc.nextInt();
	    }


	    System.out.println("The old array is:");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(a[i] + " ");
	    }

	     System.out.println();
	     System.out.println("The new array is:");



	    int temp[]=new int[n];
	    int j=0;

	    for(int i=0;i<n-1;i++){
	    	if(a[i]!=a[i+1]){

	    		temp[j]=a[i];
	    		j++;

	    	}
	    }

	    temp[j]=a[n-1];

	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(temp[i] + " ");
	    }



	}
}




                                                           remove duplicate without using another array 
*/

import java.util.*;
class RemoveDuplicateElementsInSortedArray{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);


		System.out.println("Enter the array size");
		int n=sc.nextInt();

		int a[]=new int[n];


	    System.out.println("Enter the array Elements");
	    for(int i=0;i<n;i++){
	    	a[i]=sc.nextInt();
	    }


	    System.out.println("The old array is:");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(a[i] + " ");
	    }

	     System.out.println();

	     System.out.println("The new array is:");


	    int j=0;

	    for(int i=0;i<n-1;i++){
	    	if(a[i]!=a[i+1]){

	    		a[j]=a[i];
	    		j++;

	    	}
	    }

	    a[j]=a[n-1];

	    for(int i=0;i<j+1;i++)
	    {
	    	System.out.print(a[i] + " ");
	    }



	}
}

