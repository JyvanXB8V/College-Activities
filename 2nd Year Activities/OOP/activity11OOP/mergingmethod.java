package activity11OOP;

public class mergingmethod {
	
	 public static void mergeArrays(int[] array1, int size1, int[] array2, int size2, int[] mergedArray) {
	        int index = 0;

	        for (int i = 0; i < size1; i++) {
	            mergedArray[index++] = array1[i];
	        }

	        for (int i = 0; i < size2; i++) {
	            mergedArray[index++] = array2[i];
	        }
	    }

}
