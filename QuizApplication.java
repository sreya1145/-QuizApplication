 import java.util.Scanner;

public class QuizApplication {
    private static String[] questions = {
            "What is the capital of France?",
            "Who wrote 'Hamlet'?",
            "What is the square root of 144?"
    };

    private static String[][] options = {
            {"A) London", "B) Paris", "C) Berlin", "D) Madrid"},
            {"A) Shakespeare", "B) Dickens", "C) Twain", "D) Austen"},
            {"A) 11", "B) 12", "C) 13", "D) 14"}
    };

    private static char[] answers = {'B', 'A', 'B'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.println("Your answer: ");
            char answer = scanner.nextLine().toUpperCase().charAt(0);

            if (answer == answers[i]) {
                score++;
            }
        }

        System.out.println("Quiz finished. Your score: " + score + "/" + questions.length);
    }
}
