public class Student {
    String name;
    int[] quizScores;

    public Student(String name, int[] quizScores) {
        this.name = name;
        this.quizScores = quizScores;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getQuizScores() {
        return this.quizScores;
    }

    public void setQuizScores(int[] quizScores) {
        this.quizScores = quizScores;
    }

    public void printName() {
        System.out.println(this.name);
    }

    public void printExamScores() {
        System.out.println("exam scores");
    }
}
