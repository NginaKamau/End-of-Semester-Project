import java.util.Scanner;
import java.time.LocalDate;


public class StudentsDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Arrays to make it easier to store the students and scores
        String[] studentsNames = new String[10];
        int[][] studentsScores = new int[10][5];
        String[] studentsIds = new String[10];

        //Invoking the methods
        gatherStudentInfo(studentsNames, studentsIds, scanner);
        collectScores(studentsScores, scanner);
        showStudentInfo(studentsNames, studentsIds, studentsScores);


    }

    //Method to collect student names and IDs
    public static void gatherStudentInfo(String[] names, String[] ids, Scanner input) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = input.nextLine();
            System.out.print("Enter the ID of student " + (i + 1) + ": ");
            ids[i] = input.nextLine();
        }
    }

    //Method to collect the scores linked with the loop from students and ids
    public static void collectScores(int[][] scores, Scanner input) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter score for subject " + (j + 1) + " of student " + (i + 1) + ": ");
                scores[i][j] = input.nextInt();
            }
            input.nextLine();
        }
    }

    public static String calculateGrade(double average) {
        if (average >= 70) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else if (average >= 40) {
            return "D";
        } else {
            return "REP/RET";
        }
    }

    public static void showStudentInfo(String[] names, String[] ids, int[][] scores) {

    //Title
    System.out.println("\n============ STRATHMORE UNIVERSITY REPORT CARD ============");
    //Show generated time
    System.out.println("Generated on: " + LocalDate.now() + "\n");

    for (int i = 0; i < 10; i++) 
    {
        // Calculate total and average
        int total = 0;
        for (int j = 0; j < 5; j++) 
        {
            total += scores[i][j];
        }
        double average = total / 5.0;
        String grade = calculateGrade(average);
        String recommendation = getRecommendation(grade);

        // Print student details
        System.out.println("STUDENT NAME: " + names[i]);
        System.out.println("ID NUMBER: " + ids[i]);
        System.out.println("----------------------------------------");

        // Print subjects and scores
        System.out.println("SUBJECTS:");
        for (int j = 0; j < 5; j++) 
        {
            System.out.printf("  Subject %d: %d\n", j + 1, scores[i][j]);
        }

        // Print summary
        System.out.println("----------------------------------------");
        System.out.printf("AVERAGE SCORE: %.1f\n", average);
        System.out.println("GRADE: " + grade);
        System.out.println("RECOMMENDATION: " + recommendation);
        System.out.println("\n"); 
    }
}

// Method for generating recommendation
public static String getRecommendation(String grade) 
{
    return switch (grade) 
    {
        case "A" -> "EXCELLENT (First Class)";
        case "B" -> "GOOD (Second Class Upper)";
        case "C" -> "AVERAGE (Second Class Lower)";
        case "D" -> "POOR (Pass)";
        case "E" -> "FAIL (Retake/Repeat)";
        default -> "INVALID GRADE";
    };
}
    
    
}
