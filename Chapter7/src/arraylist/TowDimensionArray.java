package arraylist;

public class TowDimensionArray {

	public static void main(String[] args) {
		
//		int[][] arr = new int[2][3];
		int[][] arr = {{1,2,3},{4,5,6}};
		
		//System.out.println(arr.length);
		//System.out.println(arr[0].length);
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
		
		char[][] alphbets = new char[13][2];
		char ch = 'A';
		
		for(int i = 0; i<alphbets.length; i++) {
			for(int j = 0; j<alphbets[i].length; j++, ch++){
				alphbets[i][j] = ch;
				System.out.println(alphbets[i][j]);
			}
		}
	}

}
