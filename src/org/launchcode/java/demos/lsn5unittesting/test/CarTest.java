package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    static Car test_car;

//@BeforeAll methods must have a void return type, must not be private, and must be static by default.
    @BeforeAll
    public static void createCarObject(){
        test_car = new Car("Toyota","Pirus",10,50);
    }

    @BeforeAll
    public static void create(){
        test_car = new Car("Toyota","Pirus",10,50);
    }
//    @Test
//    public void emptyTest(){
//        assertEquals(10,10,.001);
//    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void test1InitialsGasTank() {
        //Car test_car = new Car("Toyota","Pirus",10,50);
            assertEquals(10, test_car.getGasTankLevel(), .001);
        }


    public static boolean test2InitialsGasTank(double expectedGasLevel) {

        if (test_car.getGasTankLevel() != expectedGasLevel) {
            return false;
        } else {
            return true;
        }
    }
    @Test
            public void compare(){
            double gasLevel =0F;
            assertFalse(test2InitialsGasTank(gasLevel));
        }
        @Test
      public void testTrue(){
        double gasLevel=10f;
        assertTrue(test2InitialsGasTank(gasLevel));
        }
    //TODO: gasTankLevel is accurate after driving within tank range

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

}
