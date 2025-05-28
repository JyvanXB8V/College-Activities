package quiz6OOP;

public class Methodtry6 {
	
	public static boolean isValidPassword(String password) {
        // Check if the password has at least eight characters
        if (password.length() < 8) {
            return false;
        }

        // Check if the password consists only of letters and digits
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        // Check if the password contains at least two digits
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            return false;
        }

        // All conditions met, the password is valid
        return true;
    }
}
