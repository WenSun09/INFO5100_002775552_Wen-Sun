// Singleton Pattern Example
public class Singleton {
    public Singleton () {}

    public void SingletonPatternExample() {
        Professor professor = Professor.getProfessor();

        String question = "question";
        String answer = professor.askQuestion(question);
        System.out.println(answer);
    }
}
