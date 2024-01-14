package dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	private static final List<String> DOG_NAMES = new ArrayList<>();
	
	static {
		DOG_NAMES.add("Buddy");
		DOG_NAMES.add("Max");
		DOG_NAMES.add("Bailey");
		DOG_NAMES.add("Luna");
		DOG_NAMES.add("Ozzi");
		DOG_NAMES.add("Ralf");
		DOG_NAMES.add("Piter");
		DOG_NAMES.add("Dina");
		DOG_NAMES.add("Sonya");
		DOG_NAMES.add("Lord");
		DOG_NAMES.add("Rex");
		DOG_NAMES.add("Mika");
	}
	
	public static void main(String[] args) {
		final DogShelter shelter = new DogShelter("ЛКП Львів");

		final DogShelter shelterFR = new DogShelter("ЛКП Львів (Франківкський р-н.)");
		shelter.addShelter(shelterFR);

		final DogShelter shelterHR = new DogShelter("ЛКП Львів (Галицький р-н.)");
		shelter.addShelter(shelterHR);

		addRandomDogs(shelter);
		showAllDogs(shelter);
	}

	public static void addRandomDogs(final DogShelter shelter) {
		for (final DogShelter childShelter : shelter.getShelters()) {
			addRandomDogs(childShelter);
		}
		
		final Random random = new Random();
		for (int i = 0; i < random.nextInt(DOG_NAMES.size()); i++) {
			shelter.getDogs().add(
					new Husky(
							DOG_NAMES.get(random.nextInt(DOG_NAMES.size())),
							random.nextInt(10)));
			
			shelter.getDogs().add(
					new DeutscherSchäferhund(
							DOG_NAMES.get(random.nextInt(DOG_NAMES.size())),
							random.nextInt(10)));
			
			shelter.getDogs().add(
					new AmericanStaffordshireTerrier(
							DOG_NAMES.get(random.nextInt(DOG_NAMES.size())),
							random.nextInt(10)));
		}
	}
	
	public static void showAllDogs(final DogShelter shelter) {
		for (final DogShelter childShelter : shelter.getShelters()) {
			showAllDogs(childShelter);
		}

		System.out.println(shelter.getName());
		for (Dog dog : shelter.getDogs()) {
			System.out.println(dog);
		}
	}

}