import java.util.Scanner;

class Destination {
    private String name;
    private int days;

    public Destination(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }
}

public class TravelPlanner {
    private static final double BUDGET_PER_DAY = 100; // Example budget per day

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Travel Itinerary Planner!");

        System.out.print("Enter number of destinations: ");
        int numDestinations = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Destination[] destinations = new Destination[numDestinations];
        for (int i = 0; i < numDestinations; i++) {
            System.out.print("Enter destination " + (i + 1) + " name: ");
            String name = scanner.nextLine();
            System.out.print("Enter number of days to spend in " + name + ": ");
            int days = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            destinations[i] = new Destination(name, days);
        }

        System.out.print("Enter total number of days for the trip: ");
        int totalDays = scanner.nextInt();

        System.out.println("\nYour Travel Itinerary:");
        double totalBudget = 0;
        for (Destination destination : destinations) {
            double budgetForDestination = BUDGET_PER_DAY * destination.getDays();
            totalBudget += budgetForDestination;
            System.out.println("- " + destination.getName() + ": " + destination.getDays() + " days, Budget: $" + budgetForDestination);
        }
        System.out.println("Total trip budget: $" + totalBudget);

        System.out.println("\nYou have " + (totalDays - totalBudget / BUDGET_PER_DAY) + " extra days in your budget.");

        scanner.close();
    }
}
