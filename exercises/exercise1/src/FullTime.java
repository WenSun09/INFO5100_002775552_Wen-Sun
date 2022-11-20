public class FullTime extends Student{
    int[] examScores;

    public FullTime(String name, int[] quizScores, int[] examScores) {
        super(name, quizScores);
        this.examScores = examScores;
    }

    public void printName() {}

    public void printExamScores() {
        for (int examScore : examScores) {
            System.out.print(examScore + " ");
        }
        System.out.println();
    }
}
