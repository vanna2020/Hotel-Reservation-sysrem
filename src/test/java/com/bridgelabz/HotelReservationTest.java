package com.bridgelabz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest {
    // created object
    HotelReservationSystem hotelReservation;

    /**
     * the code marked  @before is executed before each test case
     */
    @Before
    public void before () {
        hotelReservation = new HotelReservationSystem();
    }
    @Test
    public void whenAddedHotel_ShouldReturn_AddedHotel() {
        /**
         *  try statement allows you to define a block of code to be tested for errors
         *  **/
        try{
            Assert.assertTrue(hotelReservation.addHotel( new Hotel("LakeWood",110)));
            Assert.assertTrue(hotelReservation.addHotel( new Hotel("Bridgewood",160)));
            Assert.assertTrue(hotelReservation.addHotel( new Hotel("Ridgewood",220)));
        }
        /**
         * The catch statement allowa you to define a block of code to be executed ,
         * if an error occurs in the try block
         */
        catch (Exception e){
            e.printStackTrace();

        }

    }

}