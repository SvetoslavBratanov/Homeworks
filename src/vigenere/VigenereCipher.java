package vigenere;
import java.util.Scanner;

public class VigenereCipher {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("Choose an oprion: "
					+ "\n1.Encrypt message"
					+ "\n2.Decrypt message");
			//check if the input is integer
			while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        sc.next(); 
		    }
			option = sc.nextInt();
			//validate the possible options
		} while (option < 1 || option > 2);		
		String message;
		String key;
		//ensure that the entered message and key are not empty or null
		do {
			System.out.println("Enter message:");
			message = sc.nextLine();
		} while (message.isEmpty() || message == null);	
		do {
			System.out.println("Enter key:");
			key = sc.nextLine();
		} while (key.isEmpty() || key == null);
		//remove all whitespace and making all letters in upper case
		message = makeStringAppropriate(message);
		key = makeStringAppropriate(key);	
		//covert to arrays of characters
		char[] msg = message.toCharArray();
		char[] newKey = new char[msg.length];
		//generate new key cyclically equal to the length of original message
		for(int i = 0, j = 0; i < msg.length; i++, j++){
			if(j == key.length()) {
				j = 0;
			}			
			newKey[i] = key.charAt(j);
		}			
		switch(option) {
			case 1:
				System.out.println("Encrypted Message: " + encryptMessage(msg, newKey));
				break;
			case 2:
				System.out.println("Decrypted Message: " + decryptMessage(msg, newKey));
				break;
		}
	}
	static String encryptMessage(char[] msg, char[] newKey) {
		char[] encryptedMsg = new char[msg.length];
		// encryption
		for (int i = 0; i < msg.length; i++) {
			encryptedMsg[i] = (char) (((msg[i] + newKey[i]) % 26) + 'A');
		}
		return String.valueOf(encryptedMsg);
	}
	static String decryptMessage(char[] msg, char[] newKey) {
		char[] decryptedMsg = new char[msg.length];
		// decryption
		for(int i = 0; i < msg.length; i++) {
			decryptedMsg[i] = (char)((((msg[i] - newKey[i]) + 26) % 26) + 'A');
		}		
		return String.valueOf(decryptedMsg);
	}	
	static String makeStringAppropriate(String s) {
		s = s.toUpperCase();
		s = s.replaceAll("\\s+", "");
		return s;
	}
}
