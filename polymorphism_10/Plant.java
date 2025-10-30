package polymorphism_10;

public class Plant {

	    public void grow() {
	        System.out.println("Plant is growing");
	    }
	}

	class Flower extends Plant {
	    @Override
	    public void grow() {
	        System.out.println("Flower is blooming beautifully");
	    }
	}

	class Tree extends Plant {
	    @Override
	    public void grow() {
	        System.out.println("Tree is growing tall and strong");
	    }
	}

	class Cactus extends Plant {
	    @Override
	    public void grow() {
	        System.out.println("Cactus is growing slowly in the desert");
	    }
	

	
	    public static void main(String[] args) {
	        Plant plant = new Plant();
	        Plant flower = new Flower();
	        Plant tree = new Tree();
	        Plant cactus = new Cactus();
	        
	        plant.grow();
	        flower.grow();
	        tree.grow();
	        cactus.grow();
	    }
	
}
