package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		Map<String, Object> map1 = new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("isMan", true);
		map1.put("phone", "010-1111-2222");
		
		//이름을 참조하려면? 
		//map1.get("name")은 object type이기 때문에 캐스팅 해야한다.
		String name = (String)map1.get("name"); 
		
		//전화번호를 수정하려면?
		//동일한 key값으로 다시 담는다.
		map1.put("phone", "010-3333-4444");
		
		//isMan이라는 키 값이 존재하는지 확인
		boolean isExist=map1.containsKey("isMan");
		//System.out.println(isExist);
		
		//"num"이라는 키 값으로 저장된 값 삭제
		map1.remove("num");
		
		//전체 삭제
		map1.clear();
		//System.out.println(map1);
	}
}
