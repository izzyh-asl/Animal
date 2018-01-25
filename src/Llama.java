
public class Llama extends Animal{
	
	public Llama(String name) {
		super(name);
	}

	@Override
	public String getSound() {
		return "Hmmmmmmmmm";
	}

	@Override
	public boolean hasWings() {
		return false;
	}

	@Override
	public int getNumLegs() {
		return 4;
	}
}
