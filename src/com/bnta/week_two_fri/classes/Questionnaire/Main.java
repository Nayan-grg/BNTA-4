package com.bnta.week_two_fri.classes.Questionnaire;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        Person person1= new Person("Nayan","nayan@gmail.com", LocalDate.of(1999, Month.APRIL,8));
        Questions q1= new Questions();
       q1.setQuestion("What is your hobby?");
        Questions q2= new Questions();
        q2.setQuestion("What is your favourite colour");
        Questions q3= new Questions();
        q3.setQuestion("What is your favourite animal?");
        Questions[] questionsArr1= {q1,q2,q3};
        System.out.println(questionsArr1);
        Questionnaire questionnaire1= new Questionnaire(questionsArr1);
        QuestionnaireService questionnaireService= new QuestionnaireService();
        questionnaireService.askQuestions(questionnaire1);


    }

}
