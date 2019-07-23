package co.uk.safebear;

import co.uk.safebear.kennals.Cost;
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

        Cost.setValue(125.0);

        Cost.getValue();


        System.out.println("Bella is Homeless " + bella.getisHomeless());

        bella.bark();

        System.out.println("Bella costs " + Cost.getValue() );
    }
}
