package Question1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int entry;
        String studentsName;
        int problemsSolved;
        String failedStudent = "";
        int minorProblem = 0;


        while (sc.hasNext()) {
            entry = sc.nextInt();
            for (int i = 0; i < entry; i++) {

                studentsName = sc.next();
                problemsSolved = sc.nextInt();

                students.add(new Students(studentsName, problemsSolved));
            }

            for (int j = 0; j < entry; j++) {
                if (j == 0) {

                    minorProblem = students.get(j).getProblemsSolved();
                    failedStudent = students.get(j).getStudentsName();

                } else if (students.get(j).getProblemsSolved() < minorProblem) {

                    minorProblem = students.get(j).getProblemsSolved();
                    failedStudent = students.get(j).getStudentsName();

                } else if (students.get(j).getProblemsSolved() == minorProblem) {
                    if (students.get(j).getStudentsName().compareTo(failedStudent) > 0){

                        students.get(j).getStudentsName().toLowerCase();
                        failedStudent = students.get(j).getStudentsName();

                    }
                }
            }
            System.out.println(failedStudent);

        }

    }
}

