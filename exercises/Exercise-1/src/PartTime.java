public class PartTime extends Student{

    public PartTime(String name, int[] quizScores) {
        super(name, quizScores);
    }

    public void printName() {
        System.out.println(this.name);
    }

    public void printExamScores() {}
}
