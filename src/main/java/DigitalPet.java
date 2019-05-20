
public class DigitalPet {

	private String name;
	private int hunger;
	private int thirsty;
	private int boredomNumber;

	public DigitalPet(String name) {
		this.name = name;
		this.hunger = 10;
		this.thirsty = 5;
	}

	public String getName() {

		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirsty() {
		return thirsty;
	}

	public boolean getBoredom() {

		return true;
	}

	public void feed() {
		hunger = 0;

	}

	public void giveDrink() {
		thirsty = 0;

	}

	public void goPlay() {
	boredomNumber = 0;	
		
	}

	public int getBoredomNumber() {

		return 0;
	}

}
