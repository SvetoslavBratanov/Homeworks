package homework_7_part_1;

public class task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [][] arr = {
				{true,false,false,true}, 
				{false,false,true,false}, 
				{false,true,false,false}, 
				{true,true,false,false}
		};
		boolean containTrue = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {	
				if(i < arr[i].length - 1 - j) { 
					if(arr[i][j]) {
						containTrue = true;
						break;
					}
				}
			}
		}
		if(!containTrue) {
			System.out.println("The matrix doesn't contains element with true value over the second diagonal.");
		} else {
			System.out.println("Contains element with true value over the second diagonal.");
		}
		
	}

}
