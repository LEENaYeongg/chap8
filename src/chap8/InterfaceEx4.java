package chap8;

/*
 * 인터페이스의 객체 생성
 */
interface Action {
   void action();
}
abstract class Abs{
   abstract void method();
}
public class InterfaceEx4 {

   public static void main(String[] args) {
      //이름없는 내부 클래스 => 일회성 객체로 생성되고 사용됨.
      Action a = new Action() {

         @Override
         public void action() {
            System.out.println("Action 인터페이스 객체");
         }
      };
      a.action();
      a=new Action() {
         @Override
         public void action() {
            System.out.println("Action 인터페이스 객체2");
         }
      };
      a.action();
      Abs ab = new Abs() {
    	  @Override
    	  void method() {
    		  System.out.println("Abs 추상클래스의 객체");
    	  }
      };
      ab.method();
      //jdk8.0 이후에 람다방식으로 생성 가능.
      a = ()->System.out.println("Action 인터페이스 객체를 람다로 생성");
      a.action(); //이 방법은 인터페이스만 가능.
   }
}