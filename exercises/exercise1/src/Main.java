public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[20];

        for (int i = 0; i < 20; i++) {
            int[] quizScores = new int[15];
            for (int j = 0; j < 15; j++) {
                quizScores[j] = (int)(Math.random() * 100);
            }
            if (Math.random() > 0.5) {
                int[] examScores = new int[2];
                for (int j = 0; j < 2; j++) {
                    examScores[j] = (int)(Math.random() * 100);
                }
                students[i] = new FullTime("FullTime" + i, quizScores, examScores);
            } else {
                students[i] = new PartTime("PartTime" + i, quizScores);
            }
        }

        Session session = new Session(students);
        System.out.println("Pre students average quiz scores:");
        double[] averageQuizScores = session.getAverageQuizScores();
        for (int i = 0; i <  averageQuizScores.length; i++) {
            System.out.println(students[i].getName() + ":" + averageQuizScores[i]);
        }

        System.out.println("Print the list of quiz scores in ascending order:");
        session.printQuizScoresAscending();

        System.out.println("Print names of part-time students:");
        session.printPartTimeStudentsNames();

        System.out.println("Print exam scores of full-time students:");
        session.printFullTimeStudentsExamScores();
    }
}