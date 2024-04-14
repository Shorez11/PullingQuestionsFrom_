package SimpleGame;
import java.util.Scanner;


import java.util.Timer;
import java.util.TimerTask;

public class GameSetup {
	 static boolean answered = false;
	 static boolean flag = true;
	
	public static void main(String [] args) throws Exception {
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		String username = user.next();
		
		player p = new player(username);
		
		//Questions
		//setup {question, answer1, answer2, answer3, answer4, correct answer}
		
		String[][] questions = getQuestions.questionList();
		
		
		for(int i = 0; i < questions.length; i++) {
			int rq = getQuestions.getRandomQuestion(questions);
			
			System.out.println("Question " + (i+1) + ": " + questions[rq][0]);
			
			System.out.println("Answers: \r1. " + questions[rq][1] + "\r2. " + questions[rq][2] + "\r3. " + questions[rq][3] + "\r4. " + questions[rq][4]);
			
			int userInput = user.nextInt();
			
			
	        
	        if(userInput == Integer.parseInt(questions[rq][5])) {
	        	System.out.println("You're Correct");
	        	p.setCorrect(1 + p.getCorrect());
	        	p.setScore(100 + p.getScore());
	        }
	        else {
	        	System.out.println("You're Answer was Wrong");
	        }
	        
	        
		
	        System.out.println("Enter \"ok\" to continue: ");
	        String wait = user.next();
	        
		}//for
		
		System.out.println("Players Score: " + p.getScore());
		System.out.println("Players Correct Answers: " + p.getCorrect());
		
	}

}
