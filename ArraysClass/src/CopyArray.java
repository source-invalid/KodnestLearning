import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,23,26,56,89,76,45,23,49};
		
		int arrcopy[]=Arrays.copyOf(arr,8);
		
		for(int i=0;i<=arrcopy.length-1;i++) {
			System.out.print(arrcopy[i]+" ");
		}
	}

}
