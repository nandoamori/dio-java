package test;

import domain.AircraftSingletonEager;
import domain.AircraftSingletonEnum;
import domain.AircraftSingletonLazy;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1B");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE);
        AircraftSingletonEnum aircraft = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraft.bookSeats(seat));
    }
}
