package co.uk.safebear.kennals;

public class Dog {
    private int age;
    private boolean isHomeless;
    private boolean isTagged;
    private int previousOwners;


    public void setIsHomeless(boolean _IsHomeless) {

        isHomeless = _IsHomeless;
    }

    public boolean getisHomeless() {
        return isHomeless;
    }

    public void bark() {
        System.out.println("bark");
    }

}
