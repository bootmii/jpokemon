package pok�mon;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Pok�monBattle {
	private Pok�monSpeciesCommon playerPok�mon = new Pok�monSpeciesCommon();
	private Pok�monSpeciesCommon npcPok�mon = new Pok�monSpeciesCommon();
	private boolean isAgstWild;
	public int getDamage(Pok�monMove move) {
		return (int)(((double)2*playerPok�mon.getLevel()/25*playerPok�mon.getStat(1)
				/npcPok�mon.getStat(2)*move.getBaseDamage()+2)
				*ThreadLocalRandom.current().nextDouble(.85, 1));
	}
}
