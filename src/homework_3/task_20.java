package homework_3;

public class task_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < i + 10; j++) {
				System.out.print(j % 10 + " ");
			}
			System.out.println(i);
		}	
	}
}
