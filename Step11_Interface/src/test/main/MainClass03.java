package test.main;

import test.mypac.Drill;
import test.mypac.Multiplayer;
import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//Muliplayer객체는 3가지 type이 모두 될 수 있기 때문에
		Multiplayer mp = new Multiplayer();
		useRemocon(mp);
		useDrill(mp);
		useMultiPlayer(mp);
	}
	
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	
	public static void useDrill(Drill d) {
		d.hole();
	}
	
	public static void useMultiPlayer(Multiplayer mp) {
		mp.up();
		mp.down();
		mp.hole();
	}
}
