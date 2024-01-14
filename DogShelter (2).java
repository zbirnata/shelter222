package dog;

import java.util.ArrayList;
import java.util.List;

public class DogShelter {

	private String name;
	
	private List<DogShelter> shelters = new ArrayList<>();
	
	private List<Dog> dogs = new ArrayList<>();

	public DogShelter(final String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addShelter(final DogShelter shelter) {
		shelters.add(shelter);
	}
	
	public List<DogShelter> getShelters() {
		return shelters;
	}
	
	public void addDog(final Dog dog) {
		dogs.add(dog);
	}

	public List<Dog> getDogs() {
		return dogs;
	}
	
}
