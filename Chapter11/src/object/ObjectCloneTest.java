package object;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x=" + x + ", " + "y = " + y;
	}
}
class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	public String toString() {
		return "������ " + this.point + "�̰�, �������� " + radius+" �Դϴ�.";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}


public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 5);
		Circle clonecircle = (Circle)circle.clone();
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(clonecircle));
		
		System.out.println(circle);
		System.out.println(clonecircle);
	}

}