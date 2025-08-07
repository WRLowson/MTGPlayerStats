package utils;


import player.Player;

import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserManager {
    private static final String USER_FILE = "users.txt";

    public static void savePlayer(Player player) {
        try (FileWriter fw = new FileWriter(USER_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            String line = String.join("::",
                    player.getFirstName(),
                    player.getLastName(),
                    String.valueOf(player.isUsingUsername()),
                    player.getUsername() != null ? player.getUsername() : "",
                    player.getPlayerID(),
                    player.getEmail()
            );
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving user: " + e.getMessage());
        }
    }

    public static String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();

            for (byte b : hash) {
                sb.append(String.format("%02x", b)); // convert to hex
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Encryption failed.");
        }
    }
}
