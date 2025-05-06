package Quizegame;

import java.util.*;

public class Quize {
	public static void main(String[] args) {

		QuizQuestions.addQuestions(" Which of these are selection statements in Java?", "break", "continue", "for()",
				"if()", 4);
		QuizQuestions.allQuestions();
	}
}
