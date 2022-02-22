import java.util.Scanner;

public class RNGDriver {

	public static void main(String[] args) {
		int nextGuess;
		Scanner input = new Scanner(System.in);
		String ans="i";
		do {
			int lowGuess=0;
			int highGuess=100;
			int rand = RNG.rand();
			System.out.println("Enter your first guess");
				nextGuess= input.nextInt();
			RNG.resetCount();
				do{
					
					 if(RNG.inputValidation(nextGuess, lowGuess, highGuess)== false) {
							 System.out.println("Number of Guess is " +RNG.getCount());
							 nextGuess= input.nextInt();
						 }
					else if(nextGuess > rand) {
						highGuess= nextGuess;
						System.out.println("Your Guess is too high");
						System.out.println("Enter your next guess between " + 
								lowGuess + " and " + highGuess);
						System.out.println("Number of Guess is " +RNG.getCount());
						nextGuess= input.nextInt();
						}
					else if(nextGuess < rand) {
						lowGuess = nextGuess;
						System.out.println("Your Guess is too low");
						System.out.println("Enter your next guess between " + 
								lowGuess + " and " + highGuess);
						System.out.println("Number of Guess is " +RNG.getCount());
						nextGuess= input.nextInt();				
						}
					}while(nextGuess!=rand);
				
				if(nextGuess == rand){
					System.out.println("congrats you guessed correctly");
				}
				System.out.println("Try again? (yes or no)");
					ans = input.next();
			}while(ans.equalsIgnoreCase("yes"));
		
			input.close();
			if(ans.equalsIgnoreCase("no")){
				System.out.println("Thanks for playing....");
		}	
	}
}
			
		


