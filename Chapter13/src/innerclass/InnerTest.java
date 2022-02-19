package innerclass;

class OutClass{
	 int num = 10;
	 private static int sNum = 20;
	 private InClass inClass;
	 
	 
	 public OutClass() {
		 inClass = new InClass();
	 }
	 class InClass{
		 int inNum = 200;
//		 static int sInNum = 100; // 불가?/
		 void inTest() {
			 System.out.println(num);
			 System.out.println(sNum);
		 }
		 
	 }
	 
	 public void usingTest() {//inClass가 private일 때 사용하기 위한 메소드
		 inClass.inTest();
	 }
	 static class InStaticClass{
		 int iNum = 100;
		 static int sInNum = 200;
		 
		 void InTest() {
			 //num+=10;
			 sNum+=10;
			 System.out.println(sNum);
			 System.out.println(iNum);
			 System.out.println(sInNum);
		 }
		 static void sTest() {
			 System.out.println(sNum);
			 //System.out.println(iNum); // iNum은 정적변수가 아니라서 사용 불가능
			 System.out.println(sInNum);
		 }
	 }
	 
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		
		//outClass.inClass.inTest();//inClass가 private이 아니라면 이렇게 호출
		
		//OutClass.InClass inClass = outClass.new InClass();//inClass가 private이라면 이런 식으로 사용 가능
		
	}

}
