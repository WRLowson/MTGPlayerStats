package player;

public class Player {
    private String firstName;
    private String lastName;
    private boolean useUsername;
    private String username;
    private String playerID;
    private String email;
    private String password;


    public Player(String firstName, String lastName, boolean useUsername, String username, String playerID, String email, String password){
            this.firstName = firstName;
            this.lastName = lastName;
            this.useUsername = useUsername;
            this.username = username;
            this.playerID = playerID;
            this.email = email;
            this.password= password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isUsingUsername() {
        return useUsername;
    }

    public String getUsername() {
        return username;
    }

    public String getPlayerID() {
        return playerID;
    }

    public String getDisplayName() {
        return useUsername ? username : (firstName + " " + lastName);
    }

    public String getEmail(){
        return email;
    }

    public void printSummary() {
        System.out.println("\n=== Player Summary ===");
        System.out.println("Player ID: " + playerID);
        System.out.println("Display Name: " + getDisplayName());
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}
