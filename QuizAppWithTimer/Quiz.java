import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Quizquestions> qustions;
    private int qustionIndex;
    private int score;
    private final int timeForQustion=20;
    private Scanner sc;

    public Quiz(){
        qustions=new ArrayList<>();
        sc = new Scanner(System.in);
        qustionIndex=0;
        score=0;
    }

    public void addQustions(Quizquestions q){
        qustions.add(q);
    }

    public void startquiz(){
        for (Quizquestions q :qustions){
            displayQ(q);
            boolean answercorrect=answerqustion(q);
            if (answercorrect){
                score++;
            }
        }
        displayResult();
    }

    private void displayQ(Quizquestions qua){
        System.out.println(qua.getQustiontext());
        List<String> Options=qua.getOptions();
        for(int i=0;i<Options.size();i++){
            System.out.println((i+1)+"."+Options.get(i));
        }
    }

    private boolean answerqustion(Quizquestions qua){
        System.out.println("OUR QUSTION");
        int userIndexans=sc.nextInt();
        while (userIndexans < 1 || userIndexans > qua.getOptions().size()) {
            System.out.println("Invalid input. Please enter a valid option:");
            userIndexans = sc.nextInt();
        }
        String correctans=qua.getcorrectans();
        String userans=qua.getOptions().get(userIndexans-1);
        return correctans.equals(userans);
    }

    private void displayResult(){
        System.out.println("QUIZ END||");
        System.out.println("score"+score+'/'+qustions.size());
    }

    public static void main(String[] args) {
        Quiz q=new Quiz();
        Quizquestions q1=new Quizquestions("WHO IS PRIME_MINISTER OF INDIA ?");
        q1.addaoption("Pooja gupta");
        q1.addaoption("Nerandra Modi");
        q1.addaoption("AKKHI");
        q1.addaoption("ABHI");
        q1.setCorrectAns("Nerandra Modi");

        Quizquestions q2=new Quizquestions("Which is the financial capital of INDIA");
        q2.addaoption("Nagpur");
        q2.addaoption("PUNE");
        q2.addaoption("Satna");
        q2.addaoption("Mumbai");
        q2.setCorrectAns("Mumbai");

        q.addQustions(q1);
        q.addQustions(q2);

        q.startquiz();
    }
}