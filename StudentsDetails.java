import java.util.Scanner;

public class StudentsDetails {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        //Arrays to make it easier to store the students and scores
        String[] studentsNames = new String[10];
        int[][] studentsScores = new int[10][5];
        String[] studentsIds = new String[10];

        //Invoking the methods
        gatherStudentInfo(studentsNames,studentsIds,scanner);
        collectScores(studentsScores,scanner);
        showStudentInfo(studentsScores,studentsIds,studentsScores);


    }

    //Method to collect student names and IDs
    public static void gatherStudentInfo(String[]names,String[]ids,Scanner input){
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = input.nextLine();
            System.out.print("Enter the ID of student " + (i + 1) + ": ");
            ids[i] = input.nextLine();
        }
    }
}
