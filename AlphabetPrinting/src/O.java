
public class O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if( j==0 && (i>=2 && i<=n-2) || (i==0 && (j>=2 && j<=n-3)) || (i==1 && j==n-2) || 
						(i==2 && j==n-1) || (i>=3 && i<=n-2) && j==10 || 
						(i==n-1 && j==n-2) || (i==n && (j>=2 &&j<=n-3)) || (i==1 || i==n-1) && j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
