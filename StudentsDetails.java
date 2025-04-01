import java.util.Scanner;

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

    //Method to display student info
    public static void showStudentInfo(String[] names, String[] ids, int[][] scores) {
        System.out.println("\nStudent Records:\n");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student Name: " + names[i] + ", Student ID: " + ids[i] + ", Scores: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }
}
