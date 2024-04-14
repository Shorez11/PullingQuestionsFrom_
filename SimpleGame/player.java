package SimpleGame;
public class player {
	
	String username;
	int score;
	int correctAns;
	
	public player(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getCorrect() {
		return correctAns;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setCorrect(int correct) {
		correctAns = correct;
	}

}
