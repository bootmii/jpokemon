package pokémon;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class PokémonBattle {
	// getters and setters will be added as soon as PkSpCm is finished
	private PokémonSpeciesCommon playerPokémon = new PokémonSpeciesCommon();
	private PokémonSpeciesCommon npcPokémon = new PokémonSpeciesCommon();
	private boolean isAgstWild; // flag: false for trainer, true for wild
	public int getDamage(PokémonMove move) {
		// ((2*Level*10/250)*(Attack/Defense)*Base+2)*randDouble(.85,1)
		// TODO: Add STAB once we have an enum of Elementals
		return (int)(((double)2*playerPokémon.level/25*playerPokémon.getStat(1)
				/npcPokémon.getStat(2)*move.getBaseDamage()+2)
				*ThreadLocalRandom.current().nextDouble(.85, 1));
	}
}
