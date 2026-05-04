package UI;
import model.Email;
import model.User;
import service.EmailService;

import java.util.Scanner;
//nextLine() do?
//Reads the entire line
//Includes spaces
//Stops when user presses Enter

public class MainUI {
    public static void main(String[] args) {
        System.out.println("Welcome to console based java application");


        Scanner sc = new Scanner(System.in);
        EmailService service = new EmailService();
        System.out.println("==== Email System ====");
        System.out.print("Email: ");
        String email=sc.nextLine();
        System.out.println("Enter Password");
        String Pass=sc.nextLine();
        User user=new User(email,Pass);

        if (!service.login(user)) {
            System.out.println("Login Failed");
            return;
        }

        System.out.println("Login Successful");
        int choice;
        do {
            System.out.println("\n1. Send Email");
            System.out.println("2. View Inbox");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    System.out.print("To: ");
                    String to = sc.nextLine();
                    System.out.print("Message: ");
                    String msg = sc.nextLine();
                    service.sendEmail(email, to, msg);
                    System.out.println("Email Sent");
                    break;

                case 2:
                    for (Email e : service.getInbox()) {
                        System.out.println("\n" + e);
                    }
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}



