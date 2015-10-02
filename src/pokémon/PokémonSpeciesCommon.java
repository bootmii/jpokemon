package pokémon;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class PokémonSpeciesCommon {
	public Scanner console = new Scanner(System.in);
	public short dexID; // will NEVER be greater than 32767
	/*
	 * The arrays of shorts stat* are ordered as follows:
	 * HP, Attack, Defense, Sp.Atk, Sp.Def, and Speed.
	 */
	private short[] statEVs = new short[6];
	private short[] statIVs = new short[6];
	public short[] stats = new short[6];
	private boolean IVsBuilt;
	public boolean[] nvStatusCond = new boolean[7];
	public short level; // will NEVER be greater than 32767
	public int exp;
	public Elemental primaryElemental;
	public Elemental secondaryElemental;
	// TODO lookup table
	public void setRandomIVs() {
		if(IVsBuilt) throw new IllegalArgumentException("IVs already set");
		// set 6 random ivs from 0 to 32
		for(int i : statIVs) statIVs[i]=(short)ThreadLocalRandom.current().nextInt(0,32);
		IVsBuilt = true;
		
	}
	public short getStat(int index) {
		return this.stats[index];
	}
	public boolean[] getNvStatusCond() {
		return nvStatusCond;
	}
	public void setNvStatusCond(boolean nvStatusCond, short index) {
		this.nvStatusCond[index] = nvStatusCond;
	}
	public short[] yieldEVs(short[] evsGained) {
		for(int i : statEVs) {
			// increment evs
			this.statEVs[i] += evsGained[i];
		}
		return statEVs;	
	}
}
