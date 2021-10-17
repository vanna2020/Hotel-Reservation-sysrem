package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    private List<Hotel> hotels;

    public HotelReservationSystem(){
        this.hotels = new ArrayList<>();
    }

    /**
     * This method is used to add hotel to the Hotel List
     */
    public boolean addHotel(Hotel hotel) {
        return this.hotels.add(hotel);
    }

    /**
     * This method is used to find the cheapest hotel in the HotelList
     * @return - cheapestHotel - The cheapest hotel in the list
     */
    public int findCheapestHotel(){
        int LakeWoodRate = 110; int BridgeWoodRate = 160; int Ridgewood = 220;
        int cheapestHotel = (LakeWoodRate>BridgeWoodRate) ?
                (LakeWoodRate>Ridgewood ? LakeWoodRate : Ridgewood) :
                (BridgeWoodRate>Ridgewood ? BridgeWoodRate : Ridgewood) ;
        System.out.println("The cheapest Hotel is " +cheapestHotel);
        return cheapestHotel;
    }

    public void findCheapestHotel_Weekday_Weekend() {
        String hotel = null;
        int totalLakeWoodCost = 0;
        int totalBridgeWoodCost = 0;
        int totalRidgeWoodCost = 0;

        if (hotel == "LakeWood") {
            int weekday_rate = 110;
            int weekend_rate = 90;
            totalLakeWoodCost = (weekday_rate + weekend_rate);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 150;
            int weekend_rate = 50;
            totalBridgeWoodCost = (weekday_rate + weekend_rate);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 220;
            int weekend_rate = 150;
            totalRidgeWoodCost = (weekday_rate + weekend_rate);
        }
        if (totalLakeWoodCost <= totalBridgeWoodCost && totalLakeWoodCost < totalRidgeWoodCost) {
            System.out.println("LakeWood and BridgeWood with total rates $200.");
        }
        if (totalBridgeWoodCost <= totalLakeWoodCost && totalBridgeWoodCost < totalRidgeWoodCost) {
            System.out.println("LakeWood and BridgeWood with total rates $200.");
        }
        if (totalRidgeWoodCost < totalLakeWoodCost && totalRidgeWoodCost < totalBridgeWoodCost) {
            System.out.println("RidgeWood with total rates $370.");
        }
    }
    public static void main(String[] args) throws Exception {
        Hotel hotel1 = new Hotel("LakeWood","Regular", 110,90);
        Hotel hotel2 = new Hotel("BridgeWood","Regular", 150, 50);
        Hotel hotel3 = new Hotel("RidgeWood","Regular", 220, 150);
        String sDate1="10-09-2020";
        String sDate2="11-09-2020";
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
        System.out.println(sDate1+"\t"+date1);
        System.out.println(sDate2+"\t"+date2);
        HotelReservationSystem hotel = new HotelReservationSystem();
        hotel.findCheapestHotel();
        hotel.findCheapestHotel_Weekday_Weekend();
    }
}