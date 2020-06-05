package test.mypac;

public class Aladdin extends WaltDisney{

	//생성자. WaltDisney Class 상속받음
	public Aladdin(String userName, String movieName, int runningTime) {
		super(userName, movieName, runningTime);
	}
	
	//메소드 1.
	public void GenieSong() {
		System.out.println("Friends Like Me!");
	}
	
	public void Abu() {
		System.out.println("물건을 훔쳐요");
	}

}
