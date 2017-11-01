package FinalProject;

/*Programming Queue Final Project
 * @Team Name: Carrots
 * >> Constanza Cabrera ID 1045549
 * >> Hasib Ansari ID 1080351
 * >> Joshua Folarin ID 0874110
 * Due date: (05.16.2017)
 */

import java.util.*;
public class AirportBirdMain {
    //The following are the arrays, stacks, and queues used within this project.
    private static String[] airportGrid = {"AirportGrid1", "AirportGrid2", "AirportGrid3", "AirportGrid4"};
    private static String[] airportGridTimeInterval = {"00:00 till 04:00", "04:00 till 08:00", "08:00 till 12:00", "12:00 till 16:00", "16:00 till 20:00", "20:00 till 24:00"};
    private static Map<String, Object> timeMap = new HashMap<>();
    private static Map<String, String> employeeTimeSheet = new HashMap<>();
    private static Stack<String> namesOfEmployee = new Stack<>();
    private static Queue<String> numberOfActiveGrid = new LinkedList<String>();
    private static Queue<String> numberOfInActiveGrid = new LinkedList<String>();

    public static void main(String[] args) {
        System.out.println("Airport Bird Counter-Strike Program");
        printLines();
        System.out.println("This program will provide you with the information needed to \navoid a bird strike.\n");

        showAirportGrid(); //Provides user with grid
        mainAirportTimeInterval(); //Provides user with time interval they're clocking in

        PrintTimeIntervalMap(); //Provides the time intervals that will be available/unavailable
        namesOfEmployees(); //Provides with alphabetical order of employee names.

        gridDetails(); //Provides with details concerning how many available/unavailable sections there are for the day.
    }

    private static void gridDetails() {
        System.out.println("|----------------------\t\tGrid Details\t\t----------------------|");
        System.out.println("Number of Active Grids for the day " + numberOfActiveGrid.size());
        System.out.println("Number of Inactive Grids for the day " + numberOfInActiveGrid.size());
        printLines();
    }

    private static void mainAirportTimeInterval() {
        for (String anAirportGridTimeInterval : airportGridTimeInterval) {
            System.out.println("Currently, it is : " + anAirportGridTimeInterval + ". Please input the following information:");
            requestForEmployeeInformation(anAirportGridTimeInterval); //Requests employee for specific timing.
            Map<String, String> birdPresent = new HashMap<>(); //creates an (x,y) map for bird presence
            checkTheAirportGrid(birdPresent); //Asks for bird presence in specific sections of the airport
            PrintAirportGrid(birdPresent); //Prints out information given
            timeMap.put(anAirportGridTimeInterval, birdPresent); //Times out which correlates with which
        }
    }

    private static void namesOfEmployees() {
        //List the name of the Employee
        System.out.println("|---------------\t\t\tNames of Employees (NOTE: This will remove duplicates)\t\t\t---------------|");
        Object[] namesOfEmployeesObject = namesOfEmployee.toArray();
        bubbleSort(namesOfEmployeesObject); //Sorts employee names
        System.out.print("| ");
        for (Object names: namesOfEmployeesObject) {
            System.out.print(names + " | ");
        }
        System.out.print(" |\n");
        printLines();
    }

    private static void bubbleSort(Object[] arr) {
        //Sorts the names of the employees using Data Structure Bubble Sort
        for (int i = 0; i < arr.length-1; i++) {
            Object tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i + 1] = tmp;
        }
    }

    private static void printLines() { //Non-repetetive way of repeating lines.
        int i = 0;
        System.out.print("|");
        for (;i < 58; i++) {
            System.out.print("-");
        }
        System.out.print("|\n");
    }

    private static void PrintTimeIntervalMap() {
        for(Map.Entry<String, Object> entry : timeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void PrintAirportGrid(Map<String, String> birdPresent) {
        for(Map.Entry<String, String> entry : birdPresent.entrySet()) { //Uses information to create a 'map'
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void checkTheAirportGrid(Map<String, String> birdPresent) {
        //Check the Airport Grid
        for (int j = 0; j < airportGrid.length; j++) {
            String birdPresentBoolean = "true";
            System.out.println("Are there birds present in " + airportGrid[j] + "? (Please write, 'True' or 'False'):");
            Scanner birdScanner = new Scanner(System.in);

            do { //Makes sure true and false aren't ignored when written in capital letters
                if (!(birdPresentBoolean.equalsIgnoreCase("true") || birdPresentBoolean.equalsIgnoreCase("false"))) {
                    System.out.println("Invalid input - please write 'true' or 'false':");
                    birdPresentBoolean = birdScanner.next();
                    activeAndInactiveGrid(birdPresentBoolean);
                } else {
                    birdPresentBoolean = birdScanner.next();
                    activeAndInactiveGrid(birdPresentBoolean);
                }
            } while (!(birdPresentBoolean.equalsIgnoreCase("true") || birdPresentBoolean.equalsIgnoreCase("false")));

            birdPresent.put(airportGrid[j], birdPresentBoolean); //Provides grid with location of the birds
        }
    }

    private static void activeAndInactiveGrid(String birdPresentBoolean) {
        if (birdPresentBoolean.equalsIgnoreCase("true")){
            numberOfInActiveGrid.add(birdPresentBoolean);
        } //Birds are present in these grids, can't be used.

        if (birdPresentBoolean.equalsIgnoreCase("false")) {
            numberOfActiveGrid.add(birdPresentBoolean);
        } //Birds aren't present in this grid, can be used.
    }

    private static void requestForEmployeeInformation(String key) {
        String employeeName;
        System.out.println("Dear employee, please enter your name:");
        Scanner employeeScanner = new Scanner(System.in);
        employeeName = employeeScanner.next();

        while (employeeName == null && employeeName.isEmpty()) {
            System.out.println("Invalid input - Please try again:");
            employeeName = employeeScanner.next();
        }

        employeeTimeSheet.put(key, employeeName);

        //Adds Employee Name to a Stack
        if (!namesOfEmployee.contains(employeeName)) {
            namesOfEmployee.add(employeeName);
        }

    }

    private static void showAirportGrid() {
        System.out.println("|---------------\t\tAirport Grid\t\t---------------|");
        System.out.print("|");
        for (int i = 0; i < airportGrid.length; i++) {
            System.out.print(airportGrid[i] + " | ");
        }
        System.out.println();
        printLines();
    }
}
