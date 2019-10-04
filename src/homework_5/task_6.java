package homework_5;

public class task_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] users = {12, 45, 78, 60};
		int[] users2 = {12, 45, 78, 60};
		
		boolean isEqual = true;
		if(users.length == users2.length) {
			System.out.println("The arrays are with the same length.");
			for(int i = 0; i < users.length; i++) {
				if(users[i] != users2[i]) {
					isEqual = false;
					break;
				}
			}
		} else {
			System.out.println("The arrays aren't with the same length.");
			isEqual = false;
		}
		
		System.out.println(isEqual ? "Arrays are equals." : "Arrays are not equals.");
	}

}
