import java.util.Arrays;

public class Session {
    Student[] students;

    public Session(Student[] students) {
        this.students = students;
    }

    public double[] getAverageQuizScores() {
        double[] averageQuizScores = new double[20];
        for (int i = 0; i < 20; i = i + 1) {
            int[] quizScores = students[i].getQuizScores();
            double averageQuizScore = 0.0;
            double quizNums = 0.0;
            for (int quizScore : quizScores) {
                averageQuizScore  = averageQuizScore + quizScore;
                quizNums = quizNums + 1;
            }
            averageQuizScores[i] = averageQuizScore / quizNums;
        }
        return averageQuizScores;
    }

    public void printQuizScoresAscending() {
        for (Student student : students) {
            int[] quizScores = student.getQuizScores();
            Arrays.sort(quizScores);
            for (int quizScore : quizScores) {
                System.out.print(quizScore + " ");
            }
            System.out.println();
        }
    }

    public void printPartTimeStudentsNames() {
        for (Student student : students) {
            student.printName();
        }
    }

    public void printFullTimeStudentsExamScores() {
        for (Student student : students) {
            student.printExamScores();
        }
    }
}
