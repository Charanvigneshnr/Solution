package Charan.Zoho.src;

import java.util.ArrayList;
import java.util.HashMap;

public class Train {
    public int trainId;
    public String[] stations;
    public int revenue = 0;
    public int surgeFeeMultiplier;
    public int normalSeats;
    public int premiumSeats;
    public int normalPrice;
    public int premiumPrice;
    public HashMap<Integer, Passenger> bookingDetails = new HashMap<>();
    public HashMap<Integer, String> booked = new HashMap<>();

    public Train(int trainId, String[] stations, int surgeFeeMultiplier, int normalSeats, int premiumSeats, int normalPrice, int premiumPrice) {
        this.trainId = trainId;
        this.stations = stations;
        this.surgeFeeMultiplier = surgeFeeMultiplier;
        this.normalSeats = normalSeats;
        this.premiumSeats = premiumSeats;
        this.normalPrice = normalPrice;
        this.premiumPrice = premiumPrice;
    }

    public Train(int trainId) {
        this.trainId = trainId;
        this.stations = new String[]{"Chennai", "Arakkonam", "Tiruttani", "Renigunta", "Tirupati"};
        this.surgeFeeMultiplier = 5;
        this.normalSeats = 10;
        this.premiumSeats = 5;
        this.normalPrice = 10;
        this.premiumPrice = 20;
    }

    public void bookTicket(Passenger p) {
        int pickUpPoint = p.getPickUpPoint();
        int dropPoint = p.getDropPoint();
        int numberOfTickets = p.getNumberOfTickets();
        int bookingId = p.getBookingId();
        char coachPreference = p.getCoachPreference();
        int cost = 0;
        if (pickUpPoint < dropPoint) {
            if (coachPreference == 'P') {
                if (premiumSeats >= numberOfTickets) {
                    premiumSeats -= numberOfTickets;
                    cost = numberOfTickets * premiumPrice + surgeFeeMultiplier;
                    p.setSurgeCost(surgeFeeMultiplier);
                    surgeFeeMultiplier += 5;
                } else {
                    System.out.println("Premium not available, booking normal seats");
                }
            } else {
                if (normalSeats >= numberOfTickets) {
                    normalSeats -= numberOfTickets;
                    p.setCoachPreference('N');
                    cost = numberOfTickets * normalPrice;
                }
            }
        }
        revenue += cost;
        p.setCost(cost);
        p.setBookingId(bookingId);
        p.setDropPoint(dropPoint);
        p.setPickUpPoint(pickUpPoint);
        p.setNumberOfTickets(numberOfTickets);
        bookingDetails.put(bookingId, p);
        String result = p.getNumberOfTickets() + " Tickets booked, Booking ID: " + p.getBookingId() + " from " + p.getPickUpPoint() + " to " + p.getDropPoint() + " in " + p.getCoachPreference() + ", Cost: " + p.getCost() + "\n";
        System.out.println(result);
        booked.put(bookingId, result);
    }

    public void cancelTickets(int id) {
        if (bookingDetails.isEmpty() || !bookingDetails.containsKey(id)) {
            System.out.println("No tickets to cancel!");
            return;
        }
        Passenger p = bookingDetails.get(id);
        char coach = p.getCoachPreference();
        int noOftickets = p.getNumberOfTickets();
        int cost = p.getCost();
        int surge = p.getSurgeCost();
        if (coach == 'P') {
            premiumSeats += noOftickets;
        } else {
            normalSeats += noOftickets;
        }
        revenue -= cost - surge;
        bookingDetails.remove(id);
        booked.remove(id);
    }

    public void showBookedTickets() {
        if (booked.isEmpty()) {
            System.out.println("No tickets to show!");
            return;
        }
        ArrayList<String> result = new ArrayList<>(booked.values());
        for (String s : result) {
            System.out.println(s);
        }
    }

    public void showRevenueOfTrain() {
        System.out.println("Revenue of Train " + trainId + ": " + revenue);
    }

    public int getTrainId() {
        return trainId;
    }

    public String[] getStations() {
        return stations;
    }
}
