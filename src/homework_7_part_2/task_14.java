package homework_7_part_2;

public class task_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {3, 7, -16, 86, -12, 63, 2, 0};
		int minValue = array[0];;
		int secondSmallestElement = array[0];
		for( int i = 0; i < array.length; i++ ) {
			if( array[i] < minValue ) {		            
				secondSmallestElement = minValue;		         
				minValue = array[i];
			} else if( array[i] < secondSmallestElement ) {
				secondSmallestElement = array[i];
			}
		}
		    System.out.println("Second smallest value of an array is: " + secondSmallestElement);
	}

}
