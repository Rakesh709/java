

public class QuestionService {
    Question[] questions = new Question[5];

    //constructor of class 
    public QuestionService(){
        questions[0] = new Question(1,"what you learning?","java","py","ruby","swift","java");
        questions[1] = new Question(1,"what you learning?","java","py","ruby","swift","java");
        questions[2] = new Question(1,"what you learning?","java","py","ruby","swift","java");
        questions[3] = new Question(1,"what you learning?","java","py","ruby","swift","java");
        questions[4] = new Question(1,"what you learning?","java","py","ruby","swift","java");
    }

    public void displayQuestions(){

        for(Question q : questions) {
            System.out.println(q);
        }
        
    }
}
