import java.util.Scanner; //needed to use scanner 

public class calculatingBMI {
	/* Create a BMI calculator that reads the user’s weight and height 
	 * (providing an option for the user to select which formula to use), 
	 * and then calculates and displays the user’s body mass index. Also, 
	 * display the BMI categories and their values from the National Heart Lung and Blood
	 */
	public static void main(String[] args) {
	
	int user_val; //used to determine what measurements the user will input
	double weight;
	double height;
	double BMI; 
	
	Scanner in = new Scanner (System.in);
	System.out.println("This program calculates BMI using weight & height");
	System.out.println("please press 1 if you will be using pounds and inches");
	System.out.println("please press 2 if you will be using kilograms and meters");
	user_val = in.nextInt();
	
	
	switch (user_val) {
	case 1:
		//Create a BMI calculator that reads the user’s weight and height 
		
		System.out.println("Please input your weight in pounds");
		weight = in.nextDouble();
		System.out.println("Please input your height in inches");
		height = in.nextDouble();
		BMI = (703 * weight)/(height * height);
		System.out.printf("Your BMI is: %.1f\n",BMI);
		
		//display the BMI categories and their values
		
		if (BMI < 18.5) {
			System.out.println("You are classified as underweight");
		}
		else if ((BMI >= 18.5) && (BMI <= 24.9)){
		System.out.println("You are classified as normal weight");
		}
		else if ((BMI >= 25.0) && (BMI <= 29.9)){
		System.out.println("You are classified as overweight");
		}
		else if (BMI >= 30.0){
		System.out.println("You are classified as obese");
		}
		break;
		
	case 2:
		//Create a BMI calculator that reads the user’s weight and height 
		
		System.out.println("Please input your weight in kilograms");
		weight = in.nextDouble();
		System.out.println("Please input your height in meters");
		height = in.nextDouble();
		BMI = (weight)/(height * height);
		System.out.printf("Your BMI is: %.1f\n",BMI);
		//display the BMI categories and their values
		
		if (BMI < 18.5) {
			System.out.println("You are classified as underweight");
		}
		else if ((BMI >= 18.5) && (BMI <= 24.9)){
		System.out.println("You are classified as normal weight");
		}
		else if ((BMI >= 25.0) && (BMI <= 29.9)){
		System.out.println("You are classified as overweight");
		}
		else if (BMI >= 30.0){
		System.out.println("You are classified as obese");
		}
		break;
		
		default:
		System.out.println("Goodbye!");
		break;
	
	
	
	} //brace for switch
	
	
	} //brace for main
	
} //brace for class
