import java.util.Scanner;

public class main {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		String enteredString;
		String compressedString;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			enteredString = in.nextLine();
			compressedString = compress(enteredString);
			System.out.print("input string is = "+ enteredString + "\n");			
			System.out.println("output is " + compressedString + "\n");
		}
	}
	 
	 public static String compress(String input) {
		 if(!input.equals("") || !input.isEmpty()) {
		 int orgLength = input.length();
		 if(orgLength <=2) {
			 return input;
		 }
		 StringBuffer bufferString = new StringBuffer();
		 char newChar;
		 char nextChar;
		 	for(int i = 0; i<orgLength; i++) {
		 		newChar = input.charAt(i);
		 		bufferString.append(newChar);
		 		int count = 1;
		 		for(int j = i+1; j<orgLength; j++) {
		 			nextChar = input.charAt(j);
		 			if(nextChar == newChar) {
		 				count++;
		 				if(j == orgLength-1) {
		 					bufferString.append(count);
		 					i = j;
		 					break;
		 				}
		 			}else {
		 				bufferString.append(count);
		 				i = (j-1);
		 				break;
		 			}
		 		}
		 	}
		 	int compressedLength = bufferString.length();
		 	if(compressedLength < orgLength) {
		 		return bufferString.toString();
		 	}else {
		 		return input;
		 	}		 	
		 }
		 return null;
	 }
}
