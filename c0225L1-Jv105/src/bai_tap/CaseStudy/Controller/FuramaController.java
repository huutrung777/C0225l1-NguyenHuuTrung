package bai_tap.CaseStudy.Controller;
import java.util.Scanner;

public class FuramaController {


    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int choice;
        do {
            System.out.println("\n========= FURAMA RESORT MANAGEMENT =========");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
           choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Chức năng quản lý Employee");
                    EmployeeController.displayMenu();
                    break;
                case 2:
                    System.out.println("Chưc năng quản ly Customer");
                    CustomerController.displayMenu();
                    break;
                case 3:
//                    displayFacilityMenu();
                    break;
                case 4:
//                    displayBookingMenu();
                    break;
                case 5:
//                    displayPromotionMenu();
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select again.");
                    flag = false;
                    break;
            }
        } while (choice != 6);
    }


}

