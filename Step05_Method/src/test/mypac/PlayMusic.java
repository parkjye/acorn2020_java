package test.mypac;

public class PlayMusic {
	public void getName(String name) {
		System.out.println("name: "+name);
	}
	
	public void useCom(int n, Speaker s) {
		System.out.println("호출");
	}
	
	public void getCar(Car c) {
		System.out.println("getCar 호출");
	}
	
	///////////////////////
	
	public void startM(String str) {
		System.out.println("StartM() 호출");
	}	
	
	public void endM(int num, String str) {
		System.out.println("endM----끝----");
		
	}
	
	////////////////////////
	
	public void setList(String sl) {
		System.out.println("setList 호출");
	}
	
	public void repeatList(int num) {
		System.out.println("repeat List");
	}
	
	public PlayMusicList PML() {
		return new PlayMusicList();
	}
	
	public void stopList(PlayMusicList PML, int num, String str) {
		System.out.println("==========stop=========");
	}
	
}
