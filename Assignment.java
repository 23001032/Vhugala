import java.util.*;
public class Assignment{

    static Scanner marks = new Scanner(System.in);

    public static void main(String[] args) {
        
        do {
        
            String[] subjects = {"Physics", "Mathematics", "Tshivenda", "English", "Statistics"};
            
            int[] scores = getScores(subjects);
            
            computeGrade(scores);
            
            computeAverage(scores);
            
        } while (calculateAgain());
    }

    static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    static int[] getScores(String[] subjects) {
        
        int[] scores = new int[subjects.length];
        
        for (int i = 0; i < subjects.length; i++) {
            do {
    
                System.out.print("Enter score for " + subjects[i] + ": ");
                
                int score = marks.nextInt();
                
                if (isValidScore(score)) {
                    scores[i] = score;
                } else {
                    
                    System.out.println("Invalid score. Please enter a score between 0 and 100.");
                }
            } while (scores[i] == 0);
        }
        return scores;
    }

    static void computeGrade(int[] scores) {
        
        int total = 0;
       
        for (int score : scores) {
            total += score; 
        }
        
        int average = total / scores.length;

        char grade;

        switch (average / 10) {
            case 9: case 10:
                grade = 'A'; 
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C'; 
                break;
            case 6:
                grade = 'D'; 
                break;
            default:
                grade = 'F';
        }
        System.out.println("Final Grade: " + grade);
    }

    static void computeAverage(int[] scores) {
        
        int total = 0;
       
        for (int score : scores) {
            total += score;
        }
        
        double average = (double) total / scores.length;

        System.out.println("Average Score: " + average);
    }

    static boolean calculateAgain() {
        
        System.out.print("Would you like to calculate grades for another student? (yes/no): ");
        
        String choice = marks.next();

        return choice.equalsIgnoreCase("yes");
    }
}