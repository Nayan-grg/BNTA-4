package com.bnta.week_two_fri.classes.Questionnaire;

import java.io.*;
import java.util.Scanner;

public class QuestionnaireService {

    public void askQuestions(Questionnaire questionnaire) throws IOException {
        BufferedWriter pw= new BufferedWriter((new FileWriter("answers")));
        Scanner sc= new Scanner(System.in);
        boolean hasQuestion= true;
        String text="";
            for (int i = 0; i < questionnaire.getQuestions().length; i++) {
                System.out.println(questionnaire.getQuestions()[i]);
                pw.write("\n"+ questionnaire.getQuestions()[i]);
                text= sc.next();
                pw.write( "\n" +text + ",");
            }
            pw.close();

    }
}
