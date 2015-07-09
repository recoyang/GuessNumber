import java.util.Scanner;


public class GuessNumber {

	public static void main(String[] args) {
		
		int[] a = AnswerGenerator.generateRandomNumber();
		int gameTime = 6;
	
		Scanner scr = new Scanner(System.in);
		//用户输入；
		System.out.println("Welcome!");
		
		String answerStatus = "Game Over";
		
		while(gameTime > 0){
			System.out.println("Please enter your number("+gameTime+")");
			int userInputNum = scr.nextInt();
			int[] userInput = new int[4];
			for (int i = 0; i < userInput.length; i++) {
				userInput[i] = userInputNum%10;
				userInputNum /= 10;
			}
			
			String result =	CompareNumber.compareNumbers(userInput,a);
			
			if (result.equals("4A0B")) {
				answerStatus = "Congratulations";
				break;
			}
			
			System.out.println(result);
			
			gameTime--;
		}
		System.out.println(answerStatus);
		System.exit(0);
	}

}
