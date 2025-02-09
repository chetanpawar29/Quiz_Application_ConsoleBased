package Quiz_Application_ConsoleBased;

import java.util.Scanner;

public class QuestionServices {
    
    Question[] questions = new Question[5];
    String setetedAns[] = new String[5];

    public QuestionServices()
    {
        questions[0] = new Question(1, "What is size of int", new String[]{"1","2","4","8"}, "4");
        questions[1] = new Question(2, "What is size of float", new String[]{"1","2","4","8"}, "4");
        questions[2] = new Question(3, "What is size of char", new String[]{"1","2","4","8"}, "2");
        questions[3] = new Question(4, "Which language is not support OOPs", new String[]{"Java","C","C++","Python"}, "C");
        questions[4] = new Question(5, "What is size of double", new String[]{"1","2","4","8"}, "8");
    }

    public void startQuiz()
    {
        int index = 0;
        System.out.println("******* Welcome to Chetan Quiz Application ********");
        for(Question que : questions)
        {
            System.out.println("\nQuetion No.: "+ que.getId());
            System.out.println("Que: "+que.getQuestion());

            String options[] = que.getOptions();
            for(int i=0; i<options.length; i++)
            {
                System.out.println((i+1)+") "+options[i]);
            }

            System.out.print("\nChoose Correct Option: ");
            Scanner sc = new Scanner(System.in);
            setetedAns[index++] = sc.nextLine();
            System.out.println("\n---------------------------------------------------------------");
        }
    }

    public void calculateScore()
    {
        int score = 0;
        for(int i=0; i<questions.length; i++)
        {
            if(questions[i].getAnswer().equals(setetedAns[i]))
            {
                score++;
            }
        }

        System.out.println("\nYour score in Quiz is: "+score);

        if(score > questions.length/2)
        {
            System.out.println("\nYou are Passed in Quiz..!!");
        }else{
            System.out.println("\nYou are Failed in Quiz..!! Try Next Time.");
        }
        System.out.println();
    }
    
}
