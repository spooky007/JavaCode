
public class ArrayTest {
	
	private static int[] theArray = new int[50];
	private static int arraySize;
	public static void main(String[] args) {
		ArrayTest newArray = new ArrayTest();
		newArray.generateRandomArray(10);
		newArray.printArray();
		newArray.selectionSort();
		newArray.printArray();
		int endTime = (int) System.currentTimeMillis();
	}
	
	private static void generateRandomArray(int arrayLength) {
		arraySize = arrayLength;
		for(int i = 0; i < arrayLength; i++) {
			theArray[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	private static void printArray() {
		for(int i = 0; i < arraySize; i++ ) {
			System.out.print("| " + theArray[i] + " ");
		}
		System.out.println(" ");
	} 
	
	public void selectionSort() {
		for(int i = 0; i < arraySize; i++) {
			int minimum = i;
			for(int j = i + 1; j < arraySize; j++) {
				if(theArray[minimum] > theArray[j]) {
					minimum = j;
				}
			}
			swapValues(i, minimum);
			
		}
	}
	
	public void mergeSort() {
		
	}
	
	public void swapValues(int x, int y) {
		int temp = theArray[y];
		theArray[y] = theArray[x];
		theArray[x] = temp;
	}

}
