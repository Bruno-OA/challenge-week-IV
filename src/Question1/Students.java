package Question1;

public class Students {

    String studentsName;
    int problemsSolved;

    public String getstudentsName() {
        return studentsName;
    }

    public void setstudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public int getproblemsSolved() {
        return problemsSolved;
    }

    public void setproblemsSolved(int problemsSolved) {
        this.problemsSolved = problemsSolved;
    }


    public Students(String studentsName, int problemsSolved) {
        this.problemsSolved = problemsSolved;
        this.studentsName = studentsName;
    }
}
