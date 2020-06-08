package test.mypac;

public class WaltDisney { //MainClass00
	//필드
	public String userName;
	
	private String movieName;
	private int runningTime;
	
	//생성자
	public WaltDisney(String userName, String movieName, int runningTime) {
		this.userName=userName;
		this.movieName=movieName;
		this.runningTime=runningTime;
	}
	
	//메소드 1. 영화상영
	public void playMovie() {
		System.out.println(movieName+"의 총 소요시간은 "+runningTime+"분 입니다.\n"+movieName+" 시작합니다.");
	}
	
	//메소드 2. 다음 개봉할 영화 Y/N
	public void nextMovie(String nextmovieName, int runTime) {
		//초기화 안하면 `The local variable nextmovieName may not have been initialized`
		String correctMovie=null;
		
		if(runTime >= 100) {
			correctMovie = "Y";
			System.out.println("제목: "+nextmovieName+" | 시간: "+runTime+"분 | 개봉: "+correctMovie);
		} else {
			correctMovie = "N";
			System.out.println("제목: "+nextmovieName+" | 시간: "+runTime+"분 | 개봉: "+correctMovie);
		}
		//return correctMovie;
	}
	
}
