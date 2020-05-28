package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		//String Type
		String str="abcdefg123456";
		
		//문자열의 길이, 각 리턴해주는 type이 상이함.
		
		str.length(); //int type으로 바뀜
		int size = str.length();
		
		str.charAt(5); //char로 바뀜(5번째 인덱스의 문자 1개(char)
		char ch = str.charAt(5);
		
		//소문자를 대문자로 변경하는 문자열 얻어내기
		String result = str.toUpperCase();
		
		// .method(); 
		}
}
