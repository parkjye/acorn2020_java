package test.mypac;

public class PlayMusic {

	public void openApp(String str) {
		System.out.println(str+" Opened Music Application.");
	}
	
	public PlayMusicList findList() { 
		//PlayMusicList타입, findList함수명, PlayMusicList함수 리턴
		return new PlayMusicList();
	}
	
	public PlayMusicList02 findList2(String str){
		return new PlayMusicList02(str);
	}
	
	// 키보드 입력 받아서 한곡 / 랜덤 플레이 함수 호출
	
	public void repeatList(int num) {
		System.out.println(num+"번은 한 곡 반복");
	}
	
	public void randomList(int num) {
		System.out.println(num+"번은 랜덤 Play");
	}
	
	public void closeApp() {
		System.out.println("Closed Music Application.");
	}
}
