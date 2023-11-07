package Charan.Zoho.src;

public class Passenger {
    public int bookingId;
    public int numberOfTickets;
    public char coachPreference;
    public int pickUpPoint;
    public int dropPoint;
    public int cost;
    public int surgeCost = 0;

    public Passenger(int bookingId, int numberOfTickets,
                     char coachPreference, int pickUpPoint,
                     int dropPoint) {
        this.bookingId = bookingId;
        this.numberOfTickets = numberOfTickets;
        this.coachPreference = coachPreference;
        this.pickUpPoint = pickUpPoint;
        this.dropPoint = dropPoint;
    }

    public int getSurgeCost() {
        return surgeCost;
    }

    public void setSurgeCost(int surgeCost) {
        this.surgeCost = surgeCost;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public char getCoachPreference() {
        return coachPreference;
    }

    public void setCoachPreference(char coachPreference) {
        this.coachPreference = coachPreference;
    }

    public int getPickUpPoint() {
        return pickUpPoint;
    }

    public void setPickUpPoint(int pickUpPoint) {
        this.pickUpPoint = pickUpPoint;
    }

    public int getDropPoint() {
        return dropPoint;
    }

    public void setDropPoint(int dropPoint) {
        this.dropPoint = dropPoint;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
