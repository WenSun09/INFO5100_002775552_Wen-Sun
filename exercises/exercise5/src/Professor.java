// Our course only have one professor
// Singleton Pattern Example
public class Professor {
    private static Professor professor;

    private Professor (){}


    public static Professor getProfessor() {
        if (professor == null) {
            professor = new Professor();
        }
        return professor;
    }

    public String askQuestion(String question) {
        // answer the question
        String answer = "answer";
        return answer;
    }
}
