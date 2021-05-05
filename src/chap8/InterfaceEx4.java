package chap8;

/*
 * �������̽��� ��ü ����
 */
interface Action {
   void action();
}
abstract class Abs{
   abstract void method();
}
public class InterfaceEx4 {

   public static void main(String[] args) {
      //�̸����� ���� Ŭ���� => ��ȸ�� ��ü�� �����ǰ� ����.
      Action a = new Action() {

         @Override
         public void action() {
            System.out.println("Action �������̽� ��ü");
         }
      };
      a.action();
      a=new Action() {
         @Override
         public void action() {
            System.out.println("Action �������̽� ��ü2");
         }
      };
      a.action();
      Abs ab = new Abs() {
    	  @Override
    	  void method() {
    		  System.out.println("Abs �߻�Ŭ������ ��ü");
    	  }
      };
      ab.method();
      //jdk8.0 ���Ŀ� ���ٹ������ ���� ����.
      a = ()->System.out.println("Action �������̽� ��ü�� ���ٷ� ����");
      a.action(); //�� ����� �������̽��� ����.
   }
}