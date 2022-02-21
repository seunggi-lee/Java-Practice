package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3); //shallow Copy가 되기 때문에 값이 같이 변경된다.
		
		for(int i = 0; i<bookArray1.length; i++) { //깊은복사를 하기위해서 새로 생성한 객체에 기존의 객체를 setter
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		System.out.println("====================================");
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		System.out.println("====================================");
		bookArray2[0].setBookName("기"); // 여기서도 마찬가지로 얕은복사가 발생함.
		bookArray2[0].setAuthor("박완서");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		//얕은 복사를 해결하기 위해서는 객체를 새로 생성해서 해야한다.
		System.out.println("====================================");
		
		String[] strArr = {"Java", "Android", "C"};
		for(String s : strArr) { // 배열을 모두 순회할 때 사용하는 방식
			System.out.println(s);
		}
		
		System.out.println("====================================");
		int []arr = {1,2,3,4,5};
		for(int s : arr) { // 배열을 모두 순회할 때 사용하는 방식
			System.out.println(s);
		}
	}

}
