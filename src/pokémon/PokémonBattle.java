package pokémon;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class PokémonBattle {
	private PokémonSpeciesCommon playerPokémon = new PokémonSpeciesCommon();
	private PokémonSpeciesCommon npcPokémon = new PokémonSpeciesCommon();
	private boolean isAgstWild;
	public int getDamage(PokémonMove move) {
		return (int)(((double)2*playerPokémon.getLevel()/25*playerPokémon.getStat(1)
				/npcPokémon.getStat(2)*move.getBaseDamage()+2)
				*ThreadLocalRandom.current().nextDouble(.85, 1));
	}
}
