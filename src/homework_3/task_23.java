package homework_3;

public class task_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j;
		while(i < 10) {
			j = i;
			while(j < 10) {	
				if(i == 9 && j == 9) {
					System.out.print(i + "*" + j);
				} else {
					System.out.print(i + "*" + j + "; ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
