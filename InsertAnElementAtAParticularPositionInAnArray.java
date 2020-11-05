import java.util.*;
class InsertAnElementAtAParticularPositionInAnArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();

		int a[]=new int[n];

		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position where you want to insert the element");
		int pos=sc.nextInt();

		System.out.println("Enter the element you want to insert");
		int element=sc.nextInt();


		System.out.println("old array");
		for (int i=0;i<a.length ;i++) {

			System.out.print(a[i]+" ");
			
		}

		System.out.println();
		
		for(int i=a.length-1;i>pos-1;i--){
			a[i]=a[i-1];
		}
		a[pos-1]=element;

		System.out.println("New array is");

		for (int i=0;i<a.length ;i++) {

			System.out.print(a[i]+" ");
			
		}
	}
}