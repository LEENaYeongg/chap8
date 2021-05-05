package test_1005;
/*���� Ŭ���� ����� ������ ����� �������� 
DataAccessObject �������̽��� OracleDao,MySqlDao Ŭ������ �����ϱ�.
[���]
Oracle DB���� �˻�
Oracle DB�� ����
Oracle DB�� ����
Oracle DB���� ����
Mysql DB���� �˻�
Mysql DB�� ����
Mysql DB�� ����
Mysql DB���� ���� 
 * */

interface DataAccessObject {
	void select();
	void insert();
	void delete();
	void update();
};

class OracleDao implements DataAccessObject {
	public void select() {System.out.println("Oracle DB���� �˻�");};
	public void insert() {System.out.println("Oracle DB�� ����");};
	public void delete() {System.out.println("Oracle DB���� ����");};
	public void update() {System.out.println("Oracle DB�� ����");};
}

class MySqlDao implements DataAccessObject {
	public void select() {System.out.println("Mysql DB���� �˻�");};
	public void insert() {System.out.println("Mysql DB�� ����");};
	public void delete() {System.out.println("Mysql DB���� ����");};
	public void update() {System.out.println("Mysql DB�� ����");};
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