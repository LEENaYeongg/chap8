package test_1005;
/*�־��� Ŭ������ �������̽�  �����ϱ� 
 * 
 * Animal Ŭ���� => �߻�Ŭ����
    ������� : ������ ����, �ٸ���
    ������ : ������ ������ �ٸ��� �Է¹ޱ�.
    ����޼��� :
          void eat(); => �߻�޼���
          void sound(); => �߻�޼���
���� Ŭ������ �µ��� Dog, Lion, Eagle Ŭ���� �����ϱ�
 * */
abstract class Animal {
	String type, leg;

	Animal(String type, String leg) {
		this.type = type;
		this.leg = leg;
	}
	abstract void sound();
	abstract void eat();

}

interface Flyable {
	void fly();
}

class Dog extends Animal {
	Dog() {
		super("������", "4");
	}
	void sound() {System.out.println("�۸� ¢�´�");};
	void eat() {System.out.println("������ �ִ´�� �Դ´�");};
}

class Lion extends Animal {
	Lion() {super("����", "4");}
	void sound() {System.out.println("����Ÿ���");};
	void eat() {System.out.println("�ʽĵ����� ��� �Դ´�");};
}

class Eagle extends Animal implements Flyable {
	Eagle() {super("������", "2");}
	void sound() {System.out.println("�𸥴�");};
	void eat() {System.out.println("������ ��ƸԴ´�");};
	public void fly() {System.out.println("�������� ���ư���");}
}

public class Test03 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Lion();
		animal[2] = new Eagle();
		for (Animal a : animal) {
			System.out.print(a.type + ",�ٸ���:" + a.leg + "�� =>");
			a.sound();
			a.eat();
			if (a instanceof Flyable) {
				((Flyable) a).fly();
			}
		}
	}
}
