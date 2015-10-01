package pok�mon;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Pok�monBattle {
	// getters and setters will be added as soon as PkSpCm is finished
	private Pok�monSpeciesCommon playerPok�mon = new Pok�monSpeciesCommon();
	private Pok�monSpeciesCommon npcPok�mon = new Pok�monSpeciesCommon();
	private boolean isAgstWild; // flag: false for trainer, true for wild
	public int getDamage(Pok�monMove move) {
		// ((2*Level*10/250)*(Attack/Defense)*Base+2)*randDouble(.85,1)
		// TODO: Add STAB once we have an enum of Elementals
		return (int)(((double)2*playerPok�mon.level/25*playerPok�mon.getStat(1)
				/npcPok�mon.getStat(2)*move.getBaseDamage()+2)
				*ThreadLocalRandom.current().nextDouble(.85, 1));
	}
}
