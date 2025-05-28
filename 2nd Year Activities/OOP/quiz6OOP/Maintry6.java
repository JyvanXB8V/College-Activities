package quiz6OOP;

import javax.swing.JOptionPane;

public class Maintry6 {
	
	public static void main(String[] args) {
        int totalAttempts = 3; // max attemps	

        while (totalAttempts > 0) { // Loop until attempts are exhausted
            String password = JOptionPane.showInputDialog(null, 
            		"This Program Checks Whether an Input String is Valid Password or Not\n\n" +
                    "* PASSWORD RULES ***\n\n" +
                    "- A password must have at least eight characters.\n" +
                    "- A password consists of only letters and digits.\n" +
                    "- A password must contain at least two digits\n\n" +
                    "Enter Password:");

            // pass checker
            if (Methodtry6.isValidPassword(password)) {
                JOptionPane.showMessageDialog(null, "Valid Password... Please Proceed ...");
                break;
            } else {
                totalAttempts--; // minus number of attemps
                if (totalAttempts > 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Password... ACCESS DENIED!\nPlease Try Again...\n");
                            
                }
            }
        }

        // if attemps is 3 
        if (totalAttempts == 0) {
            JOptionPane.showMessageDialog(null, "Three Failed Inputs of Valid Password...\n You are BLOCKED!");
        }
    }

}
