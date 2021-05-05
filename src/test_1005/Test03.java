package test_1005;
/*주어진 클래스와 인터페이스  구현하기 
 * 
 * Animal 클래스 => 추상클래스
    멤버변수 : 동물의 종류, 다리수
    생성자 : 동물의 종류랑 다리수 입력받기.
    멤버메서드 :
          void eat(); => 추상메서드
          void sound(); => 추상메서드
구동 클래스에 맞도록 Dog, Lion, Eagle 클래스 구현하기
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
		super("강아지", "4");
	}
	void sound() {System.out.println("멍멍 짖는다");};
	void eat() {System.out.println("주인이 주는대로 먹는다");};
}

class Lion extends Animal {
	Lion() {super("사자", "4");}
	void sound() {System.out.println("어흥거린다");};
	void eat() {System.out.println("초식동물을 잡아 먹는다");};
}

class Eagle extends Animal implements Flyable {
	Eagle() {super("독수리", "2");}
	void sound() {System.out.println("모른다");};
	void eat() {System.out.println("동물을 잡아먹는다");};
	public void fly() {System.out.println("독수리는 날아간다");}
}

public class Test03 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Lion();
		animal[2] = new Eagle();
		for (Animal a : animal) {
			System.out.print(a.type + ",다리수:" + a.leg + "개 =>");
			a.sound();
			a.eat();
			if (a instanceof Flyable) {
				((Flyable) a).fly();
			}
		}
	}
}
