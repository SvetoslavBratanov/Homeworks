package homework_7_part_2;

public class task_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {9, 103, 573, 856, -12, 33, 91, 0};
		int maxValue = array[0];;
		int secondLargestElement = array[0];
		for( int i = 0; i < array.length; i++ ) {
			if( array[i] > maxValue ) {		            
				secondLargestElement = maxValue;		         
				maxValue = array[i];
			} else if( array[i] > secondLargestElement ) {
				secondLargestElement = array[i];
			}
		}
		    System.out.println("Second largest value of an array is: " + secondLargestElement);
	}

}
