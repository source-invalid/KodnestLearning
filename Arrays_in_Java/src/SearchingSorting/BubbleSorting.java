package SearchingSorting;

public class BubbleSorting {
	
	public static int[] bubbleSort(int arr[]) {
		
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int hold=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=hold;
				}
				
			}
		}
		return arr;
	}

}
