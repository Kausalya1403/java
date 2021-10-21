package patternprinting;

public class LefttriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row=6;
		//outer loop for rows
		for(i=0;i<row;i++) {
			//inner loop work for space
			for(j=2*(row-i);j>=0;j--) {
				//prints space between 2 stars
				System.out.print(" ");
			}
			//inner loop for columns
			for(j=0;j<=i;j++) {
				//prints star
				System.out.print("* ");
			}
			//throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

}
