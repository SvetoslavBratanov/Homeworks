package homework_7_part_2;

public class task_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		int [] array = {5, 10, 2, 5, 50, 5, 10, 1, 2, 2};
		for(int i = 0; i < array.length; i++) {
			int count = 1;
			if(array[i] == Integer.MIN_VALUE) {
				continue;
			}
			for(j = 0; j < array.length; j++) {
				if(i == j) {
					continue;
				} else if(array[j] == array[i]) {
					count ++;
					array[j] = Integer.MIN_VALUE;
				}
			}
			
			System.out.println("Frequency of " + array[i] + " = " + count);
			array[i] = Integer.MIN_VALUE;
			
		}		
		
	}
}
