import java.util.Scanner;

public class Dashboard {

    public static void showDashboard() {

        Scanner sc = new Scanner(System.in);

        // Creating events
        Event event1 = new Event(
            "Tech Fest",
            "KLH University",
            "20 September 2026",
            "10:00 AM",
            150
        );

        Event event2 = new Event(
            "Cultural Fest",
            "KLH University",
            "25 September 2026",
            "5:00 PM",
            100
        );

        Event event3 = new Event(
            "Sports Meet",
            "KLH University",
            "30 September 2026",
            "9:00 AM",
            200
        );

        while (true) {

            System.out.println();
            System.out.println("========================================");
            System.out.println("       EVENT MANAGEMENT SYSTEM");
            System.out.println("========================================");

            System.out.println("1. View Events");
            System.out.println("2. Search Events");
            System.out.println("3. Book Event");
            System.out.println("4. Ticket Availability");
            System.out.println("5. Create Schedule");
            System.out.println("6. Event Routes");
            System.out.println("7. My Bookings");
            System.out.println("8. Exit");

            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println();
                    System.out.println("========== AVAILABLE EVENTS ==========");

                    System.out.println();
                    System.out.println("EVENT 1");
                    System.out.println(event1.getDetails());

                    System.out.println();
                    System.out.println("---------------------------------------");

                    System.out.println();
                    System.out.println("EVENT 2");
                    System.out.println(event2.getDetails());

                    System.out.println();
                    System.out.println("---------------------------------------");

                    System.out.println();
                    System.out.println("EVENT 3");
                    System.out.println(event3.getDetails());

                    break;

                case 2:

                    System.out.println();
                    System.out.println("========== SEARCH EVENTS ==========");
                    System.out.println("Search functionality will be added");
                    System.out.println("using AVL Tree in the next step.");

                    break;

                case 3:

                    System.out.println();
                    System.out.println("========== BOOK EVENT ==========");
                    System.out.println("Booking functionality will be added.");

                    break;

                case 4:

                    System.out.println();
                    System.out.println("========== TICKET AVAILABILITY ==========");

                    System.out.println(event1.name + " : "
                            + event1.tickets + " tickets");

                    System.out.println(event2.name + " : "
                            + event2.tickets + " tickets");

                    System.out.println(event3.name + " : "
                            + event3.tickets + " tickets");

                    break;

                case 5:

                    System.out.println();
                    System.out.println("========== CREATE SCHEDULE ==========");
                    System.out.println("Schedule functionality will be added");
                    System.out.println("using Greedy Algorithm.");

                    break;

                case 6:

                    System.out.println();
                    System.out.println("========== EVENT ROUTES ==========");
                    System.out.println("Route planning functionality will be added");
                    System.out.println("using Graph data structure.");

                    break;

                case 7:

                    System.out.println();
                    System.out.println("========== MY BOOKINGS ==========");
                    System.out.println("No bookings yet.");

                    break;

                case 8:

                    System.out.println();
                    System.out.println("========================================");
                    System.out.println("Thank you for using Event Management System!");
                    System.out.println("========================================");

                    return;

                default:

                    System.out.println();
                    System.out.println("Invalid choice.");
                    System.out.println("Please enter a number from 1 to 8.");
            }
        }
    }
}