package chap8;
/*jdk8 이후에 인터페이스도 구현부를 가진 메서드를 멤버로 가질 수 있다.
 * default 메서드 : 인스턴스 멤버
 * 		인터페이스는 다중 구현이 가능하므로, 구현객체에 똑같은 default method가 여러개 존재할 수 있으므로 
 * 		이런 경우 반드시 구현 클래스에 default 메서드를 오버라이딩 해야한다.
 * static 메서드 : 클래스 멤버 */
interface MyInterface1 {
	void method();
	default void method1() {
		System.out.println("Myinterface1의 default 메서드 : method1");
	}
	static void staticMethod() {
		System.out.println("Myinterface1의 static 메서드 : staticMethod");
	}
}
interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("Myinterface2의 default 메서드 : method1");
	}
	static void staticMethod() {
		System.out.println("Myinterface2의 static 메서드 : staticMethod");
	}
}
class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메서드 : method2");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2{
	@Override
	public void method1() {
		System.out.println("Child default 메서드 오버라이딩: method1");
	}
	@Override
	public void method() {
		System.out.println("Child 클래스의 method");
	}
}
public class InterfaceEx5 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
		c.method2();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();


	}

}
