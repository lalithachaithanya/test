package downCasting;

//Superclass Instrument
class Instrument {
	public void play() {
		System.out.println("Instrument is playing");
	}
}

//Subclass Guitar
class Guitar extends Instrument {
	@Override
	public void play() {
		System.out.println("Guitar is strumming");
	}

	// Guitar-specific method
	public void tuneStrings() {
		System.out.println("Tuning guitar strings");
	}
}

//Subclass Piano
class Piano extends Instrument {
	@Override
	public void play() {
		System.out.println("Piano is playing keys");
	}

	// Piano-specific method
	public void pressPedal() {
		System.out.println("Pressing piano pedal");
	}
}

public class InstrumentDemo {
	public static void main(String[] args) {
		// Upcasting - Guitar to Instrument reference
		Instrument myInstrument = new Guitar();

		// Calling overridden method
		myInstrument.play(); // Calls Guitar's play()

		// Downcasting - Instrument back to Guitar
		if (myInstrument instanceof Guitar) {
			Guitar myGuitar = (Guitar) myInstrument;
			myGuitar.tuneStrings(); // Calls Guitar-specific method
		}

		// Example with Piano
		Instrument anotherInstrument = new Piano();
		anotherInstrument.play(); // Calls Piano's play()

		if (anotherInstrument instanceof Piano) {
			Piano myPiano = (Piano) anotherInstrument;
			myPiano.pressPedal(); // Calls Piano-specific method
		}
	}
}