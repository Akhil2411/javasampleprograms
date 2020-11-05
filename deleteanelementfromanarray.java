import java.util.*;
class deleteanelementfromanarray{
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for (int i=0;i<n ;i++ ) {

		     a[i]=sc.nextInt();
			
		}

		System.out.println("The elements you have entered is ");
		for (int i=0;i<n ;i++ ) {

			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println("Enter the element to be deleted");
		int del_ele=sc.nextInt();
		int count=0;
		for (int i=0;i<a.length;i++ ) 
		{
			if (a[i]==del_ele) 
			{

				for (int j=i;j<a.length-1;j++ )
			    {

					a[j]=a[j+1];
					
				}
				count=count+1;
				break;
				
			}
			
		}

    

	if(count==0){
		System.out.println("Element not found ");
	}
	else{
			System.out.println("Element succesfully deleted ");
		    for(int i=0;i<a.length-1;i++)
					   	{
					   		System.out.print(a[i]+" ");
			   	        }
	}
	   	
	   	
	   



	}
}