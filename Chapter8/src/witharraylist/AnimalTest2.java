package witharraylist;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void Run() {
		System.out.println("사람이 뜁니다.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void huting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날아갑니다.");
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
		
		//다운 캐스팅 하는 방법 앞에 형변환을 이용한다. 하지만 이용하되 조건문으로 조건을 만족시컀을 경우 분기하도록 설정
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
