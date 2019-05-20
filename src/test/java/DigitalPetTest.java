import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitalPetTest {

	@Test
	public void shouldBeAbleToCreatPet() {
		DigitalPet petTest = new DigitalPet("");
	}

	@Test
	public void petShouldHaveAName() {
		DigitalPet petTest = new DigitalPet("name");
		String expectedName = petTest.getName();
		assertEquals("name", expectedName);
	}

	@Test
	public void petShouldHaveAnotherName() {
		DigitalPet petTest = new DigitalPet("Matt");
		String expectedName = petTest.getName();
		assertEquals("Matt", expectedName);
	}

	@Test
	public void petShouldHaveAThirdrName() {
		DigitalPet petTest = new DigitalPet("Lawrence");
		String expectedName = petTest.getName();
		assertEquals("Lawrence", expectedName);
	}

	@Test
	public void petShouldHaveDefaultHunger() {
		DigitalPet petTest = new DigitalPet("");
		int expectedHunger = petTest.getHunger();
		assertEquals(10, expectedHunger);
	}
	
	@Test
	public void feedingPetShouldDecreaseHungerToZero() {
		DigitalPet petTest = new DigitalPet("");
		petTest.feed();
		int expectedHunger = petTest.getHunger();
		assertEquals(0, expectedHunger);
	}
	
	@Test
	public void petShoudHaveADefaultThirsty() {
		DigitalPet petTest = new DigitalPet("");
		int expectedThirsty = petTest.getThirsty();
		assertEquals(5, expectedThirsty);
	}
	
	@Test
	public void givingADrinkShouldReduceThirstyToZero() {
		DigitalPet petTest = new DigitalPet("");
		petTest.giveDrink();
		int expectedThirsty = petTest.getThirsty();
		assertEquals(0, expectedThirsty);
	}
	
	@Test
	public void petShouldHaveDefaultBoredomOfTrue() {
		DigitalPet petTest = new DigitalPet("");
		boolean expectedBoredom = petTest.getBoredom();
		assertEquals(true, expectedBoredom);
		
	}
	
	@Test
	public void playingWithPetShouldGetBoredomToZero() {
		DigitalPet petTest = new DigitalPet("");
		petTest.goPlay();
		int expectedBoredomNumber = petTest.getBoredomNumber();
		assertEquals(0, expectedBoredomNumber);
	}
	

}
