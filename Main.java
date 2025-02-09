package Quiz_Application_ConsoleBased;

import Quiz_Application_ConsoleBased.*;

public class Main {
    
    public static void main(String args[])
    {
        QuestionServices service = new QuestionServices();
        service.startQuiz();
        service.calculateScore();
    }
}
