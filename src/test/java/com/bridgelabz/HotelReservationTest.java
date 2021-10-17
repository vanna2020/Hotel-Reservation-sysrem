package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    HotelReservationSystem hotelReservation = new HotelReservationSystem();

    @Test
    public void whenAddedHotel_ShouldReturn_AddedHotel() {
        try{
            boolean isValid1 = hotelReservation.addHotel( new Hotel("LakeWood",110));
            Assert.assertTrue(isValid1);
            boolean isValid2 = hotelReservation.addHotel( new Hotel("Bridgewood",160));
            Assert.assertTrue(isValid2);
            boolean isValid3 = hotelReservation.addHotel( new Hotel("Ridgewood",220));
            Assert.assertTrue(isValid3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void toFindTheChepeastHotel() {
        HotelReservationSystem cheapHotel = new HotelReservationSystem();
        cheapHotel.findCheapestHotel();
    }
}