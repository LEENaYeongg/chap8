package test_1005;
/*구동 클래스 실행시 다음의 결과가 나오도록 
DataAccessObject 인터페이스와 OracleDao,MySqlDao 클래스를 구현하기.
[결과]
Oracle DB에서 검색
Oracle DB에 삽입
Oracle DB에 수정
Oracle DB에서 삭제
Mysql DB에서 검색
Mysql DB에 삽입
Mysql DB에 수정
Mysql DB에서 삭제 
 * */

interface DataAccessObject {
	void select();
	void insert();
	void delete();
	void update();
};

class OracleDao implements DataAccessObject {
	public void select() {System.out.println("Oracle DB에서 검색");};
	public void insert() {System.out.println("Oracle DB에 삽입");};
	public void delete() {System.out.println("Oracle DB에서 삭제");};
	public void update() {System.out.println("Oracle DB에 수정");};
}

class MySqlDao implements DataAccessObject {
	public void select() {System.out.println("Mysql DB에서 검색");};
	public void insert() {System.out.println("Mysql DB에 삽입");};
	public void delete() {System.out.println("Mysql DB에서 삭제");};
	public void update() {System.out.println("Mysql DB에 수정");};
}

public class Test02 {
	   public static void main(String[] args) {
           dbWork(new OracleDao());
           dbWork(new MySqlDao());
      }

      private static void dbWork(DataAccessObject dao) {
            dao.select();
            dao.insert();
            dao.update();
            dao.delete();
      }
}