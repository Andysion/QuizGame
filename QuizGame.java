import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizGame{
    //#Fields
    String question1 = "Hvilket sjokolade pålegg inneholder mest sjokolade?";
    String[] answers1 = {
            " ",
            "1. Nugatti",
            "2. Nutella",
            "3. Sjokade"};
    //----------------
    String question2 = "Hvilken planet i sol systemet er kjent for sine karakteristiske ringer?";
    String[] answers2 = {
            " ",
            "1. Mars",
            "2. Jupiter",
            "3. Saturn",
            "4. Venus"};
    //---------------
    String question3 = "Hva er ulovlig å gjøre på et hotellrom i California?";

    String[] answers3 = {
            " ",
            "1. Å skrelle en løk",
            "2. Å be til gud",
            "3. Å høre på musikk etter 18.00",
            "4. Å danse"
    };
    //--------------

    int userPoints = 0;
    Scanner quizAnswer = new Scanner(System.in);
    String userAnswer = quizAnswer.nextLine();

    //#Methods

    //# Spørsmål 1
    public void question1(){
        System.out.println(question1);
        for(int i = 0; i < answers1.length; i++){
            System.out.println(answers1[i]);
        }

        String userAnswer = quizAnswer.nextLine();

        if(userAnswer.equals("2")){
            System.out.println("Riktig!");
            userPoints += 10;
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }else{
            System.out.println("Feil!");
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }
    }

    //# Spørsmål 2
    public void question2(){
        System.out.println(question2);
        for (int i = 0; i < answers2.length; i++){
            System.out.println(answers2[i]);
        }

        String userAnswer = quizAnswer.nextLine();

        if(userAnswer.equals("3")){
            System.out.println("Riktig!");
            userPoints += 10;
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }else{
            System.out.println("Feil!");
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }
    }

    //# Spørsmål 3
    public void question3(){
        System.out.println(question3);
        for (int i = 0;i < answers3.length; i++){
            System.out.println(answers3[i]);
        }

        String userAnswer = quizAnswer.nextLine();
        if(userAnswer.equals("1")){
            System.out.println("Riktig!");
            userPoints += 10;
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }else{
            System.out.println("Feil!");
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }
    }
    public void endOfQuiz(){
        if(userPoints >= 20){
            System.out.println("Gratulerer du klarte quizen!");
        }else{
            System.out.println("Du klarte ikke quizen!");
        }
    }
}

