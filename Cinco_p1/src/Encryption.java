
import java.util.Scanner; //needed to use scanner 

public class Encryption {
	
	/*A company that wants to send data over the Internet has asked you to write a program that will encrypt 
	 * it so that it may be transmitted more securely. All the data is transmitted as four-digit integers. 
	 * Your application should read a four-digit integer entered by the user and encrypt it as follows: 
	 * Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing 
	 * the new value by 10. Then swap the first digit with the third, and swap the second digit with the 
	 * fourth. Then print the encrypted integer. Write a separate application that inputs an encrypted 
	 * four-digit integer and decrypts it (by reversing the encryption scheme) to form the original number.	
	 * 
	 *  Hint: Use % to get the desired rightmost digits. 
	 *  Ex: The rightmost 2 digits of 572 is gotten by 572 % 100, which is 72.

		Hint: Use / to shift right by the desired amount.
		 Ex: Shifting 572 right by 2 digits is done by 572 / 100, which yields 5. 
		 (Recall integer division discards the fraction).* 
	 */
	
	 public static void main(String[] args) {
	
	 int number;     //number given to us by user
	 int first_digit; //digits declared to separate the digits from the number
	 int second_digit;
	 int third_digit;
	 int fourth_digit;
	 int temp; //for swapping the digits
	 
	 
	 Scanner scnr = new Scanner (System.in);
	 System.out.println("Please type in a 4 digit integer");
	 number = scnr.nextInt();
	 
	 				//technique from zybooks - phone number lab 2.30
	 first_digit = (number / 1000); //shifts 4 places to the left leaving the leftmost integer
	 second_digit = (number / 100%10); //shifts 3 places to the left leaving the 2nd leftmost integer
	 third_digit = number / 10 % 10; //shifts 2 places to the left leaving the 2nd rightmost integer
	 fourth_digit = number % 10; //removes the first three integers leaving the right most integer
	 
	 //Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing 
	 //the new value by 10
	 
	 first_digit = (first_digit + 7) % 10;
	 second_digit = (second_digit + 7) % 10;
	 third_digit = (third_digit + 7) % 10;
	 fourth_digit = (fourth_digit + 7) % 10;
	 
	 //Then swap the first digit with the third, and swap the second digit with the fourth.
	 
	 temp = first_digit;
	 first_digit = third_digit;
	 third_digit = temp;
	 
	 temp = second_digit;
	 second_digit = fourth_digit;
	 fourth_digit = temp;
	 
	 // Then print the encrypted integer.
	 
	 System.out.printf("The encrypted integer is %d%d%d%d", first_digit, second_digit, third_digit, fourth_digit);
	 

	 } // brace for main String
	 
}
