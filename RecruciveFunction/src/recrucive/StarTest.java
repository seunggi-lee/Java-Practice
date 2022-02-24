//¾î·Æ´Ù..

package recrucive;

import java.util.Scanner;
public class StarTest {
	static char[][] arr;
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
 
		arr = new char[num][num];
        
		star(0, 0, num, false);
 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
 
	static void star(int x, int y, int num, boolean blank) {
		if (blank) {
			for (int i = x; i < x + num; i++) {
				for (int j = y; j < y + num; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		if (num == 1) {
			arr[x][y] = '*';
			return;
		}
		int size = num / 3;
		int count = 0;
		for (int i = x; i < x + num; i += size) {
			for (int j = y; j < y + num; j += size) {
				count++;
				if (count == 5) { // °ø¹é Ä­ÀÏ °æ¿ì
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
	}
}