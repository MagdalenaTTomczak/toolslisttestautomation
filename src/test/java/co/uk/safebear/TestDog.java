package co.uk.safebear;

import co.uk.safebear.kennals.Dog;
import org.junit.Test;

public class TestDog {

    @Test
    public void testDogs() {

        Dog bella = new Dog();
        Dog bob = new Dog();
        Dog molly = new Dog();
        Dog sally = new Dog();
        Dog max = new Dog();

        bella.setIsHomeless(false);
        bob.setIsHomeless(true);
        molly.setIsHomeless(false);
        sally.setIsHomeless(true);

        System.out.println("Bella is Homeless " + bella.getisHomeless());

        bella.bark();
    }
}
