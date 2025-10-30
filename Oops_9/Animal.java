package Oops_9;

public class Animal {

	// Base class
	    public void makeSound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	// First subclass inheriting from Animal
	class Dog extends Animal {
	   // @Override
	    public void makeSound() {
	        System.out.println("Dog says: Bark");
	    }
	}

	// Second subclass inheriting from Animal
	class Cat extends Animal {
	    //@Override
	    public void makeSound() {
	        System.out.println("Cat says: Meow");
	    }  

	
public static void main(String[] args) {
	    	
	    	
	    	Animal animal = new Animal();
	        Dog dog = new Dog();
	        Cat cat = new Cat();
	        animal.makeSound();
	        dog.makeSound();
	        cat.makeSound();
	    	//System.out.println("hi sowmiya");
			
		}
	}

