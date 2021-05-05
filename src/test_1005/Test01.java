package test_1005;

/*1. 다음 소스는 컴파일 오류가 발생한다. => 발생 이유: 베타 타입으로 참조할 수 있는 게 없어서.
 * 결과가 "Tested" 가 출력되도록 프로그램을 수정하라.*/
interface Beta {
}

class Alpha implements Beta {
	String testIt() {
		return "Tested";
	}
}

class Gamma implements Beta {
	String testIt2() {
		return "Gamma";
	}
}

public class Test01 {
	static Beta getIt() {
		return new Alpha();
	}

	public static void main(String[] args) {
		Beta b = getIt();
		System.out.println(((Alpha) b).testIt());
	}
}