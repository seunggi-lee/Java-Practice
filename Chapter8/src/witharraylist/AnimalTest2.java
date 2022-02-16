package witharraylist;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void Run() {
		System.out.println("����� �ݴϴ�.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	public void huting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ���ư��ϴ�.");
	}
}
public class AnimalTest2 {
	
	public static void main(String[] args) {
		AnimalTest2 test = new AnimalTest2();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
		//�ٿ� ĳ���� �ϴ� ��� �տ� ����ȯ�� �̿��Ѵ�. ������ �̿��ϵ� ���ǹ����� ������ �����ðf�� ��� �б��ϵ��� ����
		if (animal instanceof Human) {
			Human human =(Human)animal;
			human.Run();
		}
		else if (animal instanceof Tiger) {
			Tiger tiger =(Tiger)animal;
			tiger.huting();
		}
		else if (animal instanceof Eagle) {
			Eagle eagle =(Eagle)animal;
			eagle.flying();
		}
	}
	
}
