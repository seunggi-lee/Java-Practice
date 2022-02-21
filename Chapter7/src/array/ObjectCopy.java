package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���1", "������");
		bookArray1[1] = new Book("�¹���2", "������");
		bookArray1[2] = new Book("�¹���3", "������");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3); //shallow Copy�� �Ǳ� ������ ���� ���� ����ȴ�.
		
		for(int i = 0; i<bookArray1.length; i++) { //�������縦 �ϱ����ؼ� ���� ������ ��ü�� ������ ��ü�� setter
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
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		System.out.println("====================================");
		bookArray2[0].setBookName("��"); // ���⼭�� ���������� �������簡 �߻���.
		bookArray2[0].setAuthor("�ڿϼ�");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		//���� ���縦 �ذ��ϱ� ���ؼ��� ��ü�� ���� �����ؼ� �ؾ��Ѵ�.
		System.out.println("====================================");
		
		String[] strArr = {"Java", "Android", "C"};
		for(String s : strArr) { // �迭�� ��� ��ȸ�� �� ����ϴ� ���
			System.out.println(s);
		}
		
		System.out.println("====================================");
		int []arr = {1,2,3,4,5};
		for(int s : arr) { // �迭�� ��� ��ȸ�� �� ����ϴ� ���
			System.out.println(s);
		}
	}

}
