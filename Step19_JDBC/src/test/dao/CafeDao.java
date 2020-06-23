package test.dao;

public class CafeDao {
	//필드
	private static CafeDao dao;
	
	//생성자
	private CafeDao() {} 
	
	//참조값 리턴
	public static CafeDao getInstance() {
		if(dao == null) {
			dao = new CafeDao();
		}
		return dao;
	}
	
	//메소드
 
	
}
