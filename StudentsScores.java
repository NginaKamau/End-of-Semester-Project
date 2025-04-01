import java.util.Scanner;
public class StudentsScores {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        //Arrays to make it easier to store the students and scores
        String[] students=new String[10];
        int[][] scores=new int[10][5];
        String[] ids=new String[10];

        //For statement that collect student details and scores
        for (int i=0; i<10; i++){
            System.out.print("Enter name for student"+(i+1)+":");
            students[i]=scanner.nextLine();
            System.out.print("Enter ID for student"+(i+1)+":");
            ids[i]=scanner.nextLine();

          //Loops to collect scores for each subject
          for(int j=0; j<5; j++) {
              System.out.print("Enter score for subject"+(j+1)+":");
              scores[i][j]=scanner.nextInt();
          }

        }
    }

}
