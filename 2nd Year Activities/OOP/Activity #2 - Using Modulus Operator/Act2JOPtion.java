package Activity2OOP;

import javax.swing.JOptionPane;

public class Act2JOPtion {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "This program converts input time in Seconds to its equivalent in Hours, Minutes, and Seconds");   
		
		String input = JOptionPane.showInputDialog("Input the time in seconds:");
		 int timeinsecs = Integer.parseInt(input);
		 
		 int hours = timeinsecs / 3600;
		 int remainingsecs = timeinsecs % 3600;
		 int mins = remainingsecs / 60;
		 int secs = remainingsecs % 60;
		 
		 String output = "The inputted time equivalent to : " + hours + " Hours " + mins + " Minutes " + secs + " Seconds ";
	        JOptionPane.showMessageDialog(null, output);

		
	}

}
