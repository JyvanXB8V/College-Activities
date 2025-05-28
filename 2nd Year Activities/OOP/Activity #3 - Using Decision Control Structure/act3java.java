package Activity3OOP;

import java.util.Scanner;

public class act3java {
    public static void main(String[] args) {
        System.out.printf("%46s", "A program to input grades in percentage\n");
        System.out.printf("%54s", "and output its numerical equivalent and remarks\n");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("%n %44s", "Input grade in Percentage (%) :  ");
            int rawgrade = scanner.nextInt();

            if (rawgrade < 0 || rawgrade > 100) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : None");
                System.out.printf("%19s %43s%n", "Remarks", ": Invalid Input Grade");
            } else if (rawgrade >= 97 && rawgrade <= 100) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 1.00");
                System.out.printf("%19s %33s%n", "Remarks", ": Excellent");
            } else if (rawgrade >= 94 && rawgrade <= 96) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 1.25");
                System.out.printf("%19s %33s%n", "Remarks", ": Excellent");
            } else if (rawgrade >= 91 && rawgrade <= 93) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 1.50");
                System.out.printf("%19s %33s%n", "Remarks", ": Very Good");
            } else if (rawgrade >= 88 && rawgrade <= 90) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 1.75");
                System.out.printf("%19s %33s%n", "Remarks", ": Very Good");
            } else if (rawgrade >= 85 && rawgrade <= 87) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 2.00");
                System.out.printf("%19s %28s%n", "Remarks", ": Good");
            } else if (rawgrade >= 83 && rawgrade <= 84) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 2.25");
                System.out.printf("%19s %28s%n", "Remarks", ": Good");
            } else if (rawgrade >= 80 && rawgrade <= 82) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 2.50");
                System.out.printf("%19s %28s%n", "Remarks", ": Fair");
            } else if (rawgrade >= 78 && rawgrade <= 79) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 2.75");
                System.out.printf("%19s %28s%n", "Remarks", ": Fair");
            } else if (rawgrade >= 75 && rawgrade <= 77) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 3.00");
                System.out.printf("%19s %30s%n", "Remarks", ": Passed");
            } else if (rawgrade >= 70 && rawgrade <= 74) {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 4.00");
                System.out.printf("%19s %35s%n", "Remarks", ": Conditional");
            } else {
                System.out.printf("%38s %9s%n", "Equivalent Numerical Grade", " : 5.00");
                System.out.printf("%19s %30s%n", "Remarks", ": Failed");
            }
        }
    }
}