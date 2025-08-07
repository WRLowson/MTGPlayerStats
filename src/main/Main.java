//playerStats idea
package main;

import player.Player;
import utils.IDUtils;
import utils.UserUtils;

import static utils.InputUtils.SCANNER;

public class Main {
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("=== MTG Player Registration ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Please, choose an option (1, 2, or 3): ");
            String input = SCANNER.nextLine();
            int option;

            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (option) {
                case 1:
                    //Register
                    Player registeredPlayer = UserUtils.userRegistration();
                    System.out.println("Registration complete. Welcome to MTG Player Stats!");
                    break;
                case 2:
                    //login
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false; // Exit loop
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}
