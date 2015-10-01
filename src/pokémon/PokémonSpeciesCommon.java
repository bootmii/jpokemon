package pokémon;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class PokémonSpeciesCommon {
	public Scanner console = new Scanner(System.in);
	private short pkmnID;
	private short[] statEVs = new short[6]; // will NEVER be greater than 32767
	private short[] statIVs = new short[6]; // will NEVER be greater than 32767
	private short[] stats = new short[6];
	private boolean IVsBuilt;
	private boolean[] nvStatusCond = new boolean[7];
	private short level; // will NEVER be greater than 32767
	private int exp;
	// FIXME: add elemental enum, then we can TODO primary/secondary elementals
	public void setRandomIVs() {
		if(IVsBuilt) throw new IllegalArgumentException("IVs already set");
		for(int i : statIVs) statIVs[i]=(short)ThreadLocalRandom.current().nextInt(0,32);
		IVsBuilt = true;
	}
	public short getStat(int index) {
		return this.stats[index];
	}
	public boolean[] getNvStatusCond() {
		return nvStatusCond;
	}
	public void setNvStatusCond(boolean[] nvStatusCond) {
		this.nvStatusCond = nvStatusCond;
	}
	public short getLevel() {
		return level;
	}
}
