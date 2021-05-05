package chap8;
/* interface를 매개변수로 사용하기
 * */
class Unit{
	int hp;
	final int MAX;
	Unit(int hp) {
		this.hp = hp;
		MAX = hp;
	}
}
class AirUnit extends Unit{
	AirUnit(int hp) { super(hp);}
}
class GroundUnit extends Unit {
	GroundUnit(int hp) {super(hp);}
}
interface Repairable {} //멤버 없어도 인터페이스 가능.
class Tank extends GroundUnit implements Repairable {
	Tank() {super(150);}
	public String toString() {
		return "Tank";
	}
}
class DropShip extends AirUnit implements Repairable{
	DropShip() {super(125);}
	public String toString() {return "Dropshop";}
}
class Marine extends GroundUnit{
	Marine() {super(40);}
	public String toString() {return "Marine";}
}
class Scv extends GroundUnit implements Repairable{
	Scv() {super(60);}
	public String toString() {return "Scv";}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r; //
			u.hp = u.MAX;
			System.out.println(r + " 수리 완료"); //interface는 obj에 있는 멤버에 접근 가능. 따라서 r을 u로 써도됨.
		}
	}
}

public class InterfaceEx3 {
	public static void main(String[] args) {
		Tank t =  new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		Scv s = new Scv();
		s.repair(t);
		s.repair(d);
//		s.repair(m); //error
		s.repair(s);
		
	}

}
