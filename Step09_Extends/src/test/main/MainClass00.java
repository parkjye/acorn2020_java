package test.main;
import test.mypac.WaltDisney;
import test.mypac.Aladdin;

public class MainClass00 {
	public static void main(String[] args) {
		/* [ WaltDisney, Aladdin ]
		 *  
		 * 
		 *  
		 *  */
		
		Aladdin Mena = new Aladdin("박지예","알라딘",128);
		Mena.Abu();
		Mena.GenieSong();
		
		System.out.println("");
		
		WaltDisney LoinKing = new WaltDisney("박지예","LoinKing",118);
		LoinKing.playMovie();
		System.out.println(LoinKing.nextMovie("LionKing", 118));

	}
}
