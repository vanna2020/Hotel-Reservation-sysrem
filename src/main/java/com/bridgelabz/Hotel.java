package com.bridgelabz;
public class Hotel {
    String hotelName;
    int hotelRegularRate;

    /**
     * brConstructor Name must be same as class name
     * we pass argument that is String hotelName and int hotelName
     */

    public Hotel(String hotelName, int hotelRegularRate) {

        /** Parameter and instance variable are same
         * So we are using this keyword
         */

        this.hotelName = hotelName;
        this.hotelRegularRate = hotelRegularRate;
    }
}

