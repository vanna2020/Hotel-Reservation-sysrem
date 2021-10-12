package com.bridgelabz;
import java.util.ArrayList;

public class HotelReservationSystem {
    ArrayList<Hotel> hotels = new ArrayList<>(); //creating arraylist

    /**
     * This method is used to add hotel to the Hotel List
     */

    public boolean addHotel(Hotel hotel) {
        return hotels.add(hotel);
    }
}
