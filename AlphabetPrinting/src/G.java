
public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(((i==0 || i==n) && (j>1 && j<n-1)) || ((i==1 || i==n-1) && j==1) || (j==0 && (i>1 && i<n-1)) 
						|| ((i==1 || i==n-1) && j==n-1) || (j==n && (i>=2 && i<=3)) || (i<n-1 && i>n/2) && j==n
						|| (i==(n/2)+1 && j>n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
