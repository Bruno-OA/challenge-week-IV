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

        while (sc.hasNext()) {
            entry = sc.nextInt();
            for (int i = 0; i < entry; i++) {

                studentsName = sc.next();
                problemsSolved = sc.nextInt();

                students.add(new Students(studentsName, problemsSolved));
                System.out.println(students);
            }

        }

    }
}

