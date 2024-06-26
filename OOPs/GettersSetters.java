import java.util.*;
public class GettersSetters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        BankAccount ac1 = new BankAccount();
        ac1.setUsername("Piyush");
        ac1.setPassword("ahgis");
        System.out.println(ac1.getUsername());
        System.out.println(ac1.getPassword());;
    }
}

class BankAccount {
    String username;
    private String password;
    
    void setUsername(String newUsername) {
        username = newUsername;
    }

    String getUsername() {
        return this.username;
    }

    void setPassword(String newPassword) {
        password = newPassword;
    }

    String getPassword() {
        return password;
    }
}