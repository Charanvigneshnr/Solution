package Charan.Practice.Zoho.src;

import java.util.ArrayList;
import java.util.Scanner;

/*
TODO (Till 1:30PM)
Train Reservation System:
n trains, for simplicity assume 1 with train id = 1
5 stations
Each train has 2 coach, 1 premium (n = 5 seats), 2 normal (n = 10)
Normal Per station cost = 10rs
Premium Per station cost = 20rs
Premium cost surge+=5 regardless of cancellation

Variables:
Train id (which train)
Booking id (passenger details)
Passenger details: ID (Auto Assigned), Number of tickets, Coach preferrance, Pickup, Drop

Methods:
1. Book Ticket
2. Cancel Ticket
3. Show Booked Tickets
4. Show Revenue of each trains
5. Exit
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\nTrain Reservation System");
        System.out.println("------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of trains: ");
        int noOfTrains = sc.nextInt();
        ArrayList<Train> trains = new ArrayList<>();
        for (int i = 0; i < noOfTrains; i++) {
            trains.add(new Train(i + 1));
        }
        trains.add(new Train(7, new String[]{"Chennai", "Bangalore", "Delhi"}, 10, 20, 10, 25, 50));
        int id = 0;
        int input = 0;
        while (input < 5) {
            System.out.print("1. Book Tickets\n2. Cancel Tickets\n3. Show Booked Tickets\n4. Show Revenue of trains\n5. Exit\nEnter your choice: ");
            input = sc.nextInt();
            switch (input) {
                case 1: {
                    Train train = null;
                    System.out.println("\nBook Train");
                    System.out.print("Enter Train ID: ");
                    int trainId = sc.nextInt();
                    for (Train t : trains) {
                        if (t.getTrainId() == trainId) {
                            train = t;
                        }
                    }
                    displayTrains(train);
                    System.out.println("\nEnter your details");
                    System.out.print("Number of Tickets: ");
                    int numberOfTickets = sc.nextInt();
                    System.out.print("Enter coach preference(P-Premium, N-Normal): ");
                    char coachPreference = sc.next().charAt(0);
                    System.out.print("Enter pickup station id: ");
                    int pickUpStation = sc.nextInt();
                    System.out.print("Enter drop station id: ");
                    int dropStation = sc.nextInt();
                    Passenger p = new Passenger(++id, numberOfTickets, coachPreference, pickUpStation, dropStation);
                    train.bookTicket(p);
                    break;
                }
                case 2: {
                    System.out.println("\nCancel Tickets");
                    Train train = null;
                    System.out.print("Enter Train ID: ");
                    int trainId = sc.nextInt();
                    for (Train t : trains) {
                        if (t.getTrainId() == trainId) {
                            train = t;
                        }
                    }
                    System.out.print("Enter your booking id: ");
                    int bookingId = sc.nextInt();
                    train.cancelTickets(bookingId);
                    System.out.println("Tickets cancelled successfully");
                    break;
                }
                case 3: {
                    System.out.println("\nShow Booked Tickets");
                    System.out.print("Enter Train ID: ");
                    int trainId = sc.nextInt();
                    System.out.println("Your Ticket(s)");
                    for (Train t : trains) {
                        if (t.getTrainId() == trainId) {
                            t.showBookedTickets();
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("\nShow Revenue of trains");
                    for (Train t : trains) {
                        t.showRevenueOfTrain();
                    }
                    break;
                }
                case 5: {
                    input = 5;
                    break;
                }
                default: {
                    System.out.println("\nInvalid input");
                    break;
                }
            }
        }
    }

    private static void displayTrains(Train train) {
        System.out.print("Stations: ");
        String[] stations = train.getStations();
        for (int i = 0; i < stations.length; i++) {
            System.out.print((i + 1) + ". " + stations[i] + " ");
        }
    }
}

