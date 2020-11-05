/*import java.util.*;
class RemoveDuplicateElementsInUnsortedArray{
	public static void main(String[] args) {
		int a[]={11,22,33,11,13,22,15,20};
		HashSet<Integer> hs=new HashSet<Integer>();

		for(int i=0;i<a.length;i++){

			hs.add(a[i]);

		}

		for(int num:hs){
			System.out.print(num+" ");
		}
	}
}




                                     remove duplicate charecters from strings*/



import java.util.*;
class RemoveDuplicateElementsInUnsortedArray{
	public static void main(String[] args) {
		String word="Destination";
		String newr="";
		char ch[]=word.toCharArray();

		HashSet<Character> hs=new HashSet<Character>();  

		for(char w:ch){

			if(!hs.contains(w)){
			  hs.add(w);
			  newr=newr+w;
			}else{

			System.out.println("Duplicate charecter "+w+" Removed");

		}

		}


		
		System.out.println("String after duplicate elements are removed is  " +newr);
	}
}
