import java.util.*;

public class OnlineExam {
    static Scanner sc = new Scanner(System.in);
    static String[][] questions = {
        {"Java is a?", "1. Language", "2. Database", "3. OS", "4. Compiler", "1"},
        {"OOP stands for?", "1. Object Oriented Programming", "2. Order of Process", "3. Output of Program", "4. Option Oriented Process", "1"}
    };

    public static void main(String[] args) {
        System.out.print("Enter Username: ");
        String user = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals("student") && pass.equals("pass")) {
            int score = 0;
            for (String[] q : questions) {
                System.out.println("\n" + q[0]);
                System.out.println(q[1]);
                System.out.println(q[2]);
                System.out.println(q[3]);
                System.out.println(q[4]);
                System.out.print("Enter option (1-4): ");
                String ans = sc.nextLine();
                if (ans.equals(q[5]))
                    score++;
            }
            System.out.println("\nExam Over. Your Score: " + score + "/" + questions.length);
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
