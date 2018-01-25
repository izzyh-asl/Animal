
public class MANIALlama extends Llama{
	
	public MANIALlama(String name) {
		super(name);
	}

	@Override
	public String getSound() {
		return "STAY FROSTY";
	}

	@Override
	public String getName() {
		return "Frosty";
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
