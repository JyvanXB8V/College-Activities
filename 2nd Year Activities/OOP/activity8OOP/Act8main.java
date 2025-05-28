package activity8OOP;

public class Act8main {

public static void main(String[] args) {
	    
        int size = 12;
        int multiplication[][] = new int[size][size];
        
       
        for (int row = 0; row < size; row++) { 
            for (int col = 0; col < size; col++) {
                multiplication[row][col] = (row + 1) * (col + 1);
            }
        }
        
        System.out.println("\n\t\t\t    MULTIPLICATION TABLE\n ");
        
        for(int i = 0; i < 10; i++) {
        	System.out.print("________");
        }
        System.out.print("\n");
        
        System.out.print("|     |"); 
        for (int i = 1; i <= size; i++) {
            System.out.printf(" %3d |", i); 
        }
        System.out.println(); 
        
      
        System.out.print("_");
        for (int i = 0; i < 13; i++) {
            System.out.print("_____|"); 
        }
        System.out.println(); 
        
       
        for (int row = 0; row < size; row++) { 
            System.out.printf("| %3d |", row + 1); 
            
            for (int col = 0; col < size; col++) {
                System.out.printf(" %3d |", multiplication[row][col]);
            }
            System.out.println(); 
            
            
            System.out.print("-");
            for (int i = 0; i < 13; i++) {
                System.out.print("_____|"); 
            }
            System.out.println(); 
        }
    }
}