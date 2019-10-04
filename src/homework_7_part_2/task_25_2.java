package homework_7_part_2;
import java.util.Scanner;
public class task_25_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, p, q, sum = 0, i, j, k;
		 
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number of rows and columns of first matrix.");
	      System.out.println("Enter rows: ");
	      m = sc.nextInt();
	      System.out.println("Enter columns:");
	      n = sc.nextInt();
	 
	      int first[][] = new int[m][n];
	 
	      System.out.println("Enter the elements of first matrix");
	 
	      for ( i = 0 ; i < m ; i++ ) {
	    	  for ( j = 0 ; j < n ; j++ ) {
	    		  first[i][j] = sc.nextInt();
	    	  }    
	      }	 
	      System.out.println("Enter the number of rows and columns of second matrix.");
	      System.out.println("Enter rows: ");
	      p = sc.nextInt();
	      System.out.println("Enter columns:");
	      q = sc.nextInt();
	 
	      if( n != p ) {
	    	  System.out.println("Matrices with entered values can't be multiplied with each other."); 
	      } 
	      else {
	         int second[][] = new int[p][q];
	         int multiply[][] = new int[m][q];
	 
	         System.out.println("Enter the elements of second matrix");
	 
	         for ( i = 0 ; i < p ; i++ ) {
	        	 for ( j = 0 ; j < q ; j++ ) {
	        		 second[i][j] = sc.nextInt();
	        	 }
	         }
	            
	         for ( i = 0 ; i < m ; i++ ) {
	            for ( j = 0 ; j < q ; j++ ) {   
	               for ( k = 0 ; k < p ; k++ ) {
	                  sum += first[i][k]*second[k][j];
	               }
	               multiply[i][j] = sum;
	               sum = 0;
	            }
	         }
	         System.out.println("Product of entered matrices:");
	         for ( i = 0 ; i < m ; i++ ) {
	            for ( j = 0 ; j < q ; j++ ) {
	            	System.out.print(multiply[i][j]+"\t");
	            }
	            System.out.println();
	         }
	      }
	      sc.close();
	}

}
