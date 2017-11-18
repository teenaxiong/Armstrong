/*
 * Teena Xiong
 * 9/27/2016 
 * 
 * Assignment 01
 * 
 * ****This program will be using the Math.pow() method. It is needed to raise a number to the nth power. 
 * ****It will also be using the Math.log10() method. It is needed to find how many digits does the interger contain. 
 * 
 * The program will be testing to see if what the user enter is a Armstrong or not. To be an Armstrong number, each digit of the 
 * integer is raised to the number of how many digits the number contains and then it is summed together. If the sum of all the
 * digit is equal to the original number, then it
 * is consider an Armstrong number. 
 * 
 * This program will ask user to either chose
 *  1.) a number between 1-9999 or
 *  2.)let the computer generate a random number for them.
 *  
 *  Depending on the user choice:
 *  if user enters a 1, then they will be prompt to enter a number between 1-9999. It will be stored in userNumber.
 *  If user enters a 2, then the computer will generate a random number between 1-9999.
 *  
 *  Next, the program will go through one long multi-nested if loops.
 *  It will first test to see if what the user choice is equal to 1 or 2. If it does, it will go through multiple if statement
 *  to see if the the userNumber is an Armstrong number.
 *  If user choice is not 1 or 2, it will jump automatically down to the end of the else if statement, and print a good-bye statement.
 *  It will be the end of the program.
 *  
 *  If user choice is equal to 1 or 2, the program will run through many if statements.
 *  Before entering the first if statement, the program will determined how many digits does the userNumber contain and it will be
 *  stored in a int variable name length.
 *  The first if statement will have an expression to see if length is equal to 1. If it does, it will use the pow method to cube
 *  the first digit. This digit will be stored in totalDigit.
 *  
 *  If it doesn't equal to 1, it will jump down the next else-if statement and see if the length is equal to 2. If it does, it will 
 *  repeat the process of finding what each digit is and taking the cube of it, adding the cube together and initializing it
 *  into the variable totalDigit. 
 * 
 * If it doesn't equal to 2, it will jump down the the next else-if statement and test it to see if it equals to 3. If it does, it will 
 *  repeat the process of finding what each digit is and taking the cube of it, adding the cube together and initializing it
 *  into the variable totalDigit. 
 *  
 *  If it doesn't equal to 3, it will jump down the the next else-if statement and test it to see if it equals to 4. If it does, it will 
 *  repeat the process of finding what each digit is and taking the cube of it, adding the cube together and initializing it
 *  into the variable totalDigit. 
 *  
 *  Finally, if it the length of the userNumber doesn't equal to either 1, 2, 3, or 4, it will go to the last else statement. A 
 *  printout will print saying user didn't enter a number between 1-9999. The program will close. 
 *  
 *  Next, another if statement. This statement will be used to test if the userNumber is equal to the totalDigit. If it is, then 
 *  it is an Armstrong.
 *  If it is not, it will jump to the else statement with a expression of length<=4. This expression is used to make sure that
 *  userNumber has a digit of 4 or less. The statement will run and it will print out a statement saying that the userNumber is
 *  not an Armstrong number. 
 *  
 * 
 */
import java.util.Scanner; //allows us to use the Scanner method. 
public class Armstrong { //the beginning of the class

	public static void main (String [] args) //main method. 
	{
		Scanner input = new Scanner (System.in);
		
		int userNumber=0; //will hold either user's input or random generated number. Initialize to 0. 
		
		System.out.print("Please pick a number: \n 1. Enter your own digit. \n 2. Get a randomly generated number.");
		int userPick = input.nextInt();  //user picks either a 1 or 2. it will be store in userPick. 
		
		
		
		/*What user picked is stored in userPick. This will be use in the if-else statement expression. If user picks 1, it will
		 *equal to the first if-statement expression and the statement will be run. However, if user picks 2, it will jump down to the
		 * next else-if statement and that one will be ran instead. 
		 */
		if(userPick == 1) //if user picks 1, this if statement will be initiated. 
			{
			System.out.print("\nPlease enter an integer number between 1 - 9999: ");
			userNumber = input.nextInt(); //user's will enter their number and it will be store in userNumber. 
			}
		else if	(userPick ==2) //if user picks 2, this else-if statement will be initiated instead. 
			{
			userNumber = (int)(Math.random() * 9999) + 1; //computer will randomly generate a number between 1 and 9999. 
			System.out.println("\nThe computer randomly generated a number for you: " + userNumber); //prints out the screen what the 
																									//computer generated. 
			}
		
		
		
		/* This will be a multi-nested if statement. First, it will test to see if userPick is equal to either 1 or 2. If it does,
		 * then it will go through the many nested-if statement to see if the userNumber is an Armstrong.
		 * However, if userPick is not either 1 or 2, it will jump all the way
		 * down the else statement and will display a message saying that user did not pick a 1 or 2. The program will close then. 
		 */
		if(userPick==1 || userPick==2) //first if-statement. testing if userPick is either  1 or 2. 
			{
			int totalDigit=0; //initializing the variable to 0. This will hold the sum of all the powered digit. 
			int length = (int)(Math.log10(userNumber)+1); //using the log10 method to see how many digits does userNumber has.  
		
			if(length == 1) //if the userNumber is just one digit, this if statement is ran. 
				{
				totalDigit = (int) Math.pow(userNumber, length); //using the pow method to raise the userNumber to a power of 1 digit. 			
				}
		
			else if (length == 2) //if the userNumber has two digits, this if statement is ran. 
				{
				int firstDigit = userNumber / 10; //to find out what is the first digit, we divide by 10. 
				int secondDigit = userNumber % 10; //we use the modulus to find out what is the second digit. 
				totalDigit = (int)Math.pow(firstDigit, length) + (int)Math.pow(secondDigit, length); //using the pow method to raise the first
																					//and second digit to the power of 2. The sum of
																					//these cubed digits are stored in totalDigit. 
				}
		
			else if (length == 3) //if the userNumber contains three digit, this if statement is ran. 
				{
				int firstDigit = userNumber / 100; //to get the first digit, we divide by 100. 
				int secondDigit = (userNumber % 100) / 10; //to get the second digit, we find the remainder by doing 
															//userNumber % 100 and dividing it by 10. 
				int thirdDigit = userNumber % 10; //to get the third digit, we find the remainder by userNumber % 10
			 
				//By using the pow method, each digit is raised to 3rd power and then added together to get the totalDigit. 
				totalDigit = (int)Math.pow(firstDigit, length) + (int)Math.pow(secondDigit, length) + (int)Math.pow(thirdDigit, length);
				}

			else if (length == 4) //if the length is 4 digit, this if statement is ran instead. 
				{
				int firstDigit = userNumber / 1000; //to find the first digit, we divide the userNumber by 1000
				int secondDigit = (userNumber % 1000) / 100; //to find the second digit, we find the modulus of 
															//userNumber % 1000 and divided it by 100. 
				int thirdDigit = ((userNumber % 1000) % 100)/10; //this formula is used to find the third digit. 
				int fourthDigit = ((userNumber % 1000) % 100) % 10; //this formula is used to find the forth digit. 
				
				//By using the pow method, each digit is cubed and then added together to get the totalDigit.
				totalDigit = (int)Math.pow(firstDigit, length) + (int)Math.pow(secondDigit, length) + (int)Math.pow(thirdDigit, length) 
						+ (int)Math.pow(fourthDigit, length);
				}
		
			//if none of the if statement is true (the length is either equal to 0 or greater than 4) this else statement is printed
			else System.out.println("Sorry. The number must be within 1 - 9999. Good-bye."); 
		
		
			//this is used to finally determined if the number that the user enters (which is stored in userNumber) is equal to
			//to the totalDigit (which contains the sum of all the cubed digit in userNumber). 
			if (totalDigit == userNumber && userNumber > 0) //if totalDigit is equal to userNumber, and greater than 0,
															//then this is run. It is an Armstrong number. 
				{
				System.out.println("\n" + userNumber + " is an Armstrong number." + " After raising each digit to the " +
					" number of total digits and summing it," +
					" the result is: " + totalDigit);
				System.out.println("\nThank you for using our program. Good-bye"); //closing the program. 
				}
			
			
			//if totalDigit is not equal to userNumber and userNumber>0, this else statement is tested. 
			//The expression length<=4 is to make sure that
			// before it is ran, the userNumber is not equal to totalDigit and that the length of userNumber is 4 or less. 
			//ALso, check to make sure userNumber >0 because we don't want this to run if user enters a number less than 0. 
			else if(length<=4 && userNumber > 0) 
				{
				System.out.println("\n" + userNumber + " is not an Armstrong number. The sum after raising each "
						+ " digit to the power of the number of digits is "+ totalDigit);
				System.out.println("\nThank you for using our program. Good-bye"); //closing the program. 
				}
		}
		
		//if user does not enter a 1 or 2, this statement is ran. 
		else System.out.println("Invalid choice. Program will shut down. Good-bye.");
		
	}
	
}
