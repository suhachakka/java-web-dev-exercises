package org.launchcode.java.demos.lsn6inheritance;
public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight); //Inherited parent class constructors by adding super
        name = aName;
    }

    public HouseCat(String aName) {
        name = aName;
    }

    public HouseCat(double aWeight) {
        super(aWeight);
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

//        @Override
//    public String noise() {
//        return "Hello, my name is " + name + "!";
//    }


    @Override
    public String noise() {
        if (isSatisfied()) {
            return "Hello, my name is " + name + "!";
        } else {
            return "Meooooooooooooooooowwwww";
        }
    }



    public String purr() {
        return "I'm a HouseCat";
    }
}
