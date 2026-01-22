import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    String selection[] = new String[5];

    //constructor of class 
    public QuestionService(){
        questions[0] = new Question(1,"what you learning?","java","py","ruby","swift","java");
        questions[1] = new Question(2,"what you eat?","apple","mango","pineapple","grapes","grapes");
        questions[2] = new Question(3,"what you think?","gaming","cricket","wife","playstaion","wife");
        questions[3] = new Question(3,"what you create?","YT","INSTA","REELS","SHORTS","yt");
        questions[4] = new Question(5,"what you read?","books","comics","newspaper","article","comics");
    }

    // public void displayQuestions(){

    //     for(Question q : questions) {
    //         System.out.println(q);
    //     }
        
    // }

    public void payluQuiz(){
        int i=0;
        for(Question q : questions){
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] =  sc.nextLine();
            i++;
            System.out.println("---------------");
        }
        
        for(String s : selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score =0;
        for(int i=0; i<questions.length; i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }

        }
        System.out.println("Your score is: " + score);
    }
}
