package dog;

public abstract class Dog implements Animal {
	
    private final int age;
    private final String name;
    
    public Dog(final String name, final int age) {
    	this.name = name;
        this.age = age;
    }
    
    @Override
    public String getName() {
    	return name;
    }

    @Override
    public int getAge() {
    	return age;
    }
    
    @Override
    public String toString() {
    	return "Ім'я: " + getName() + ", Вік: " + getAge() + " років";
    }
    
}
