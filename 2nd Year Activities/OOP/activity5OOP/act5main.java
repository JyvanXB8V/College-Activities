package activity5OOP;

import java.util.Scanner;

public class act5main {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        String[] strArr = new String[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("This program using One Dimensional Array finds duplicate values in an array of");
        System.out.println("inputted integers and strings.");
        System.out.println(" ");

        // Take input for integer array
        for (int i = 0; i < 10; i++) {
        	System.out.printf("       Enter Number [%d]: ", i);
            
            
            numArr[i] = scanner.nextInt();
        }

        System.out.printf("\n");
        for (int i = 0; i < numArr.length - 1; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] == numArr[j]) {
                    System.out.println("       Duplicate Numeric Element: " + numArr[i]);
                }
            }
        }
        
        System.out.printf("\n");
        for (int i = 0; i < 10; i++) {
        	System.out.printf("       Enter Letters [%s]: ", i);
        	strArr[i] = scanner.next();
        }
        
        System.out.printf("\n");
        for (int i = 0; i < strArr.length - 1; i++) {
        	for (int j = i + 1; j < strArr.length; j++) {
        		if (strArr[i].equals(strArr[j])) {
        			System.out.println("       Duplicate String Element: " + strArr[i]);
        		}
        	}
        }
        
    }
    
}