package test.mypac;

public class WaltDisney {
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
	public String nextMovie(String nextmovieName, int runTime) {
		//초기화 안하면 `The local variable nextmovieName may not have been initialized`
		String correctMovie=null;
		
		if(runTime >= 100) {
			correctMovie = nextmovieName;
		} else {
			System.out.print("안돼요 ");
			correctMovie = nextmovieName;
		}
		return correctMovie;
	}
	
}
