package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String... args){
        HouseCat garField = new HouseCat("Garfield",12);
        garField.eat();
        System.out.println(garField.isTired());


        HouseCat mittens = new HouseCat("Mittens");
        System.out.println(mittens.getWeight());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        HouseCat peteTheCat = new HouseCat("Pete The Cat");
        peteTheCat.setWeight(15);
        System.out.println(peteTheCat.getWeight());


        //Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        HouseCat plainCat = new HouseCat("plainCat",8.6);

        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(garField.noise()); // prints "Hello, my name is Cheshire!"
        HouseCat suki = new HouseCat("Suki",12);
        CatOwner Annie = new CatOwner(suki);
        Annie.feedTheCat();

    }
}
