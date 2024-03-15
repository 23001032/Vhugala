import javax.swing.JOptionPane;

class Login {
    private String username;
    private String password;

    public Login(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    public boolean checkPasswordComplexity() {
        int minLength = 8;
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;
        String specialCharacters = "@#$%^&+=";

        if (password.length() >= minLength) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                }
                if (Character.isDigit(c)) {
                    hasNumber = true;
                }
                if (specialCharacters.contains(String.valueOf(c))) {
                    hasSpecialCharacter = true;
                }
            }
        }
        return hasUpperCase && hasNumber && hasSpecialCharacter;
    }

    public boolean checkUserName() {
        int maxUsernameLength = 5;
        char underscore = '_';
        return username.contains(String.valueOf(underscore)) && username.length() <= maxUsernameLength;
    }

    public String registerUser() {
        String invalidUsernameMessage = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        String invalidPasswordMessage = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";

        boolean isUserNameValid = checkUserName();
        boolean isPasswordValid = checkPasswordComplexity();

        if (!isUserNameValid) {
            return invalidUsernameMessage;
        } else if (!isPasswordValid) {
            return invalidPasswordMessage;
        } else {
            return "Registration successful.";
        }
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }
}

public class Reg {

    public static void main(String[] args) {
        String user = JOptionPane.showInputDialog("Account Creation:\nEnter Username:");
        String pass = JOptionPane.showInputDialog("Enter Password:");
        String firstName = JOptionPane.showInputDialog("Enter First Name:");
        String lastName = JOptionPane.showInputDialog("Enter Last Name:");

        Login login = new Login(user, pass);

        String registrationMessage = login.registerUser();
        JOptionPane.showMessageDialog(null, registrationMessage);

        if (registrationMessage.equals("Registration successful.")) {
            String loginUsername = JOptionPane.showInputDialog("Login:\nEnter Username:");
            String loginPassword = JOptionPane.showInputDialog("Enter Password:");

            if (login.loginUser(loginUsername, loginPassword)) {
                JOptionPane.showMessageDialog(null, "Welcome " + firstName + " " + lastName + ", it is great to see you again.");
            } else {
                JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
            }
        }
    }
}
