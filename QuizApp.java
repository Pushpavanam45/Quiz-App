package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class QuizApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Question> questions = new ArrayList<>();
		
		questions.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"this", "super", "extends", "implements"}, 'C'));
        questions.add(new Question("Which data type is used to create a variable that should store text?",
                new String[]{"myString", "String", "Txt", "string"}, 'B'));
        questions.add(new Question("Which operator is used to compare two values?",
                new String[]{"=", "==", "!=", "<>"}, 'B'));
        questions.add(new Question("Java is which type of language?",
                new String[]{"Object-Oriented", "Procedural", "Assembly", "Markup"}, 'A'));

        int score = 0;
        
        System.out.println(" Quiz Game");
        System.out.println("......");
        
        
        int questionNumber = 1;
        for(Question q : questions) {
        	System.out.println("\n Question "+ questionNumber +":");
        	q.display();
        	
        	System.out.println("Your Answer ( A/B/C/D): ");
        	char answer = s.next().charAt(0);
        	
        	if(q.isCorrect(answer)) {
        		System.out.println("Correct!");
        		score++;
        	}
        	else {
        		System.out.println("Wrong!.. Correct answer is : "+q.correctOption);
        		
        	}
        	questionNumber++;
        }
        System.out.println("\n Quiz Completed");
        System.out.println("Your Score is : "+ score+"/"+ questions.size());
		s.close();
		// TODO Auto-generated method stub

	}

}
