import java.util.*;

public class QuizApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] questions = {
            "What is the extension of Java files?\n1. .js\n2. .java\n3. .txt\n4. .py",
            "Which company developed Java?\n1. Microsoft\n2. Google\n3. Sun Microsystems\n4. Oracle"
        };
        int[] answers = {2, 3};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Enter your answer: ");
            int ans = sc.nextInt();
            if (ans == answers[i]) score++;
        }

        System.out.println("\nYour final score is: " + score + "/" + questions.length);
    }
}
