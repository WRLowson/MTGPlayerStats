//playerStats idea
package main;

import player.Player;
import utils.IDUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MTG Player Registration ===");

        System.out.println("First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Use a username instead of your real name? (Yes/No)");
        boolean useUsername = scanner.nextLine().equalsIgnoreCase("yes");

        String username = null;
        if(useUsername){
//            while(true){
                System.out.print("Enter username: ");
                username = scanner.nextLine().toLowerCase();
//                if (UserManager.isUsernameAvailable(username)){
//                   break;
//                }
//                else{
//                    System.out.println("Username is already taken, please try another.");
//                }
//            }
        }

        System.out.println("Enter Email: ");
        String email= scanner.nextLine();

        System.out.println("create a password ");
        String password = scanner.nextLine();

        String playerID = IDUtils.generateHexPlayerID();

        Player newPlayer = new Player(firstName, lastName, useUsername, username, playerID, email, password);
        newPlayer.printSummary();

    }
}
