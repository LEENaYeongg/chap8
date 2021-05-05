package chap8;
abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat();
}
interface Flyable {
	void fly();
}
class Dove extends Animal implements Flyable{
	Dove() {super("��ѱ�");}

	@Override
	void eat() {
		System.out.println("��ѱ�� ���� ������ ��ƸԴ´�.");
	}

	@Override
	public void fly() {
		System.out.println("��ѱ�� ���ƴٴѴ�.");
	}
}
class Monkey extends Animal{
	Monkey() {super("������");}

	@Override
	void eat() {
		System.out.println("�����̴� �������� ���Ÿ� ���Դ´�.");
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove(); //dove�� animalŸ������ ����ȯ�� �ȴ�. animalŸ���� �߻�Ŭ������ �������.
		a.eat(); //��ѱ�� ���� ������ ��ƸԴ´�.
		if (a instanceof Flyable) {
			((Flyable)a).fly(); //��ѱ�� ���ƴٴѴ�.
		}
		a = new Monkey();
		a.eat(); //�����̴� �������� ���Ÿ� ���Դ´�.
		if (a instanceof Flyable) {
			((Flyable)a).fly();//����ȵ�.
		}
	}
}
