package day1;
public class FindingDuplicateElement {
	public static void main(String[] args){
		int[] arr= {2,5,7,7,5,9,2,3};
		//to go each element in array
		for (int i=0;i<arr.length-1;i++ ) {
			// to compare with current element with all elements
			for(int j=i+1;j<arr.length;j++) {
				if(arr [i]==arr[j]) {
				System.out.println("Duplicate Element:" + arr[i]);	
				// duplicate element are 2,5 and 7 
				}
			}
		}
	}

}
