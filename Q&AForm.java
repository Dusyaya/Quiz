import java.util.Scanner;

public class Q&AForm{
    private final static String QUESTION_AND_ANSWER_STRING=
            "Вопрос:%n%s%nВарианты ответа:%n%s%n";

    // поля вопроса, скрыты в классе
    private String question;
    private String[]answers;
    private int rightAnswerNumber;

    //форма для нового вопроса
    public QuestionForm(String question,String[]answers,int rightAnswerNumber){
            this.question=question;
            this.answers=answers;
            this.rightAnswerNumber=rightAnswerNumber;
            }
    //запоминание правильного ответа
    public int getRightAnswerNumber(){return rightAnswerNumber;}

    public String toString () { //возвращает строку описания объекта
        return String.format (QUESTION_AND_ANSWER_STRING, question, answers);
        }

    public int yourAnswer(){
        System.out.println("Введите номер выбранного ответа:");
        Scanner scanner=new Scanner(System.in);
        int yourAnswerNumber=scanner.nextInt();
        return yourAnswerNumber;
        }


}
