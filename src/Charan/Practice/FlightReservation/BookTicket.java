package Charan.Practice.FlightReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Flight Reservation System");
        System.out.print("Enter number of flights: ");
        int numberOfFlights = sc.nextInt();
        ArrayList<Flight> flights = new ArrayList<>();
        for (int i = 0; i < numberOfFlights; i++)
            flights.add(new Flight(i + 1));
        int passengerID = 1;
        while (true) {
            System.out.println("1. Book 2. Cancel 3. Print");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Flight ID");
                    int fid = sc.nextInt();
                    if (fid > flights.size()) {
                        System.out.println("Invalid flight ID");
                        break;
                    }
                    Flight currentFlight = null;
                    for (Flight f : flights) {
                        if (f.flightID == fid) {
                            currentFlight = f;
                            f.flightSummary();
                            break;
                        }
                    }
                    System.out.println("Enter number of tickets");
                    int t = sc.nextInt();
                    if (t > currentFlight.tickets) {
                        System.out.println("Not Enough Tckets");
                        break;
                    }
                    book(currentFlight, t, passengerID);
                    passengerID = passengerID + 1;
                    break;
                }
                case 2: {
                    System.out.println("Enter flight ID and passenger ID to cancel booking");
                    int fid = sc.nextInt();
                    if (fid > flights.size()) {
                        System.out.println("Invalid flight ID");
                        break;
                    }
                    Flight currentFlight = null;
                    for (Flight f : flights) {
                        if (f.flightID == fid) {
                            currentFlight = f;
                            break;
                        }
                    }
                    int id = sc.nextInt();
                    cancel(currentFlight, id);
                    break;
                }
                case 3: {
                    for (Flight f : flights) {
                        if (f.passengerDetails.isEmpty()) {
                            System.out.println("No passenger Details for Flight " + f.flightID);
                        } else
                            print(f);
                    }
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    public static void book(Flight currentFlight, int tickets, int passengerID) {
        String passengerDetail;
        passengerDetail = "Passenger ID " + passengerID + " -- " + " Number of Tickets Booked "
                + tickets + " -- " + "Total cost " + currentFlight.price * tickets;
        currentFlight.addPassengerDetails(passengerDetail, tickets, passengerID);
        currentFlight.flightSummary();
        currentFlight.printDetails();
    }

    public static void cancel(Flight currentFlight, int passengerID) {
        currentFlight.cancelTicket(passengerID);
        currentFlight.flightSummary();
        currentFlight.printDetails();
    }

    public static void print(Flight f) {
        f.printDetails();
    }
}