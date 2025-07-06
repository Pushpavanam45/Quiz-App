package Quiz;

public class Question {
	String questionText;
	String[] options;
	char correctOption;
	
	
	
	public Question(String questionText,String[] options, char correctOption) {
		this.questionText = questionText;
		this.options = options;
		this.correctOption = correctOption;
		
		
	}
	public void display() {
		System.out.println(questionText);
		char optionChar = 'A';
		for(String option : options) {
			System.out.println (optionChar + ". "+ option);
			optionChar++;
		}
		
	}
	public boolean isCorrect(char userAnswer) {
		return Character.toUpperCase(userAnswer) == Character.toUpperCase(correctOption);
		
	}

}
