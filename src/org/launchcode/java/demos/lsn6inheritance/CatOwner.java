package org.launchcode.java.demos.lsn6inheritance;

public class CatOwner  extends PetOwner{
    //private Cat pet;
    private Feedable pet;

   // public CatOwner(Cat pet){
    public CatOwner(Feedable pet){
        super(pet);
        //this.pet = pet;

    }

    public void feedTheCat(){
        // ...code to prepare the cat's meal...
       pet.eat();
   }
}
