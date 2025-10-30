package polymorphism_10;

public class Animal {
	
	    public void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Dog barks: Woof woof!");
	    }
	}

	class Cat extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Cat meows: Meow meow!");
	    }
	}

	class Cow extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Cow moos: Moo moo!");
	    }
	

	    public static void main(String[] args) {
	        Animal animal = new Animal();
	        Animal dog = new Dog();
	        Animal cat = new Cat();
	        Animal cow = new Cow();
	        
	        animal.sound();
	        dog.sound();
	        cat.sound();
	        cow.sound();
	    }
	}
