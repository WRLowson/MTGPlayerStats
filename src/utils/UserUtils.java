package utils;

import player.Player;

import static utils.InputUtils.SCANNER;

public class UserUtils {

    public static Player userRegistration(){
        System.out.println("First Name: ");
        String firstName = SCANNER.nextLine();

        System.out.println("Last Name: ");
        String lastName = SCANNER.nextLine();

        System.out.println("Use a username instead of your real name? (Yes/No)");
        boolean useUsername = SCANNER.nextLine().equalsIgnoreCase("yes");

        String username = null;
        if(useUsername){
//            while(true){
            System.out.print("Enter username: ");
            username = SCANNER.nextLine().toLowerCase();
//                if (UserManager.isUsernameAvailable(username)){
//                   break;
//                }
//                else{
//                    System.out.println("Username is already taken, please try another.");
//                }
//            }
        }
        System.out.println("Enter Email: ");
        String email= SCANNER.nextLine();

        System.out.println("Create a password: ");
        String password = SCANNER.nextLine();
        String passwordHash = UserManager.encryptPassword(password);

        String playerID = IDUtils.generateHexPlayerID();

        Player newPlayer = new Player(firstName, lastName, useUsername, username, playerID, email, passwordHash);
        UserManager.savePlayer(newPlayer);
        newPlayer.printSummary();
        return newPlayer;
    }


    public static void userLogin(){}
}
