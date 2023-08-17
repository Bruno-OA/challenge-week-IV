package Question1;

public class Students {

    String studentsName;
    int problemsSolved;

    public String getStudentsName() {
        return studentsName;
    }

    public int getProblemsSolved() {
        return problemsSolved;
    }

    public Students(String studentsName, int problemsSolved) {
        this.problemsSolved = problemsSolved;
        this.studentsName = studentsName;
    }
}
