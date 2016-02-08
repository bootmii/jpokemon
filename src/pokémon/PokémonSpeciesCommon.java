package pokémon;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class PokémonSpeciesCommon {
	public Scanner console = new Scanner(System.in);
	private int dexID; // will NEVER be greater than 32767
	/*
	 * The arrays of ints stat* are ordered as follows:
	 * HP, Attack, Defense, Sp.Atk, Sp.Def, and Speed.
	 */
	private int[] statEVs = new int[6];
	private int[] statIVs = new int[6];
	private int[] stats = new int[6];
	private boolean ivsBuilt;
	private boolean[] nvStatusCond = new boolean[7];
	private boolean isConfused;
	private int level; // will NEVER be greater than 32767
	private int exp;
	private Elemental primaryElemental;
	private Elemental secondaryElemental;
	// TODO lookup table
	public void setRandomIVs() {
		if(ivsBuilt) throw new IllegalArgumentException("IVs already set");
		// set 6 random ivs from 0 to 32
		for(int i : statIVs) statIVs[i]=(int)ThreadLocalRandom.current().nextInt(0,32);
		ivsBuilt = true;
		
	}
	public int getStat(int index) {
		return this.stats[index];
	}
	public boolean[] getNvStatusCond() {
		return nvStatusCond;
	}
	public void setNvStatusCond(boolean nvStatusCond, int index) {
		this.nvStatusCond[index] = nvStatusCond;
	}
	public int[] yieldEVs(int[] evsGained) {
		for(int i : statEVs) {
			// increment EVs
			this.statEVs[i] += evsGained[i];
		}
		return statEVs;	
	}
	public PokémonSpeciesCommon(int dexID, int[] stat, int lvl, int xp, Elemental pElemental, Elemental sElemental) {
		this.dexID = dexID;
		stats = stat;
		level = lvl;
		exp = xp;
		primaryElemental = pElemental;
		secondaryElemental = sElemental;
		setRandomIVs();
	}
}
