package Zohocodinground.maths;

import java.time.LocalDate;
import java.util.*;

public class BusReservationSystem {
    public static void main(String[] args) {

        Set<Integer> bookedSeats = new HashSet<>(List.of(3,4,5,6));
        List<Integer> userPreference = List.of(1,2,5,4,6);

        boolean success = checkAvailability(bookedSeats, userPreference);

        if (success) {
            bookedSeats.addAll(userPreference);
            System.out.println(userPreference + " seats are successfully booked! ");
        }

        System.out.println("Final booked seats: " + bookedSeats);    }

    public static boolean checkAvailability(Set<Integer> bookedSeats, List<Integer> userPreference) {
        boolean allAvailable = true;

        for (int seats : userPreference) {
            if (bookedSeats.contains(seats)) {
                System.out.println("Seat " + seats + " is already booked");
                allAvailable = false;
            }
        }

        return allAvailable;
    }

}
