package test;

import domain.AircraftSingletonEager;
import domain.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonLazy.getInstance());
        AircraftSingletonLazy aircraft= AircraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeats(seat));
    }
}
