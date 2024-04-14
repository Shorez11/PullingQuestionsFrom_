package SimpleGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class getQuestions {
	
	public static int getRandomQuestion(String[][] questionList) throws Exception { 
        Random random = new Random();
        int randNum = random.nextInt(questionList.length);
        return randNum;
        //Note: Can currently pull the same # again. Will write code in the future to get around this issue
    }
	
	public static String[][] questionList() throws Exception {
		File file = new File("\\Users\\kjbet\\Questions.txt"); //Temp filepath 
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String[][] questions = new String[10][6]; 
			// Number of columns and rows currently hard coded due to file.length basically being the # of characters in the file
			//Want to see if there's an easier way, but after spending hours on dealing with randomaccessfile
			//and having to scrap that, rn here's a simple solution
			for (int i = 0; i < 10; i++) {
				String string = reader.readLine(); 
				String[] arrString = string.split(",", 0);
				int j = 0;
					for (String a : arrString) {
						questions[i][j] = a;
						j++;
					}
			}
			return questions;
		}
	}
}
