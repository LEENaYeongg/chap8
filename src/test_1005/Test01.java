package test_1005;

/*1. ���� �ҽ��� ������ ������ �߻��Ѵ�. => �߻� ����: ��Ÿ Ÿ������ ������ �� �ִ� �� ���.
 * ����� "Tested" �� ��µǵ��� ���α׷��� �����϶�.*/
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