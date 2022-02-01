package com.bnta.week_two_fri.classes.Questionnaire;

import com.bnta.week_two_fri.classes.Email.EmailValidator;

import java.time.LocalDate;
import java.util.Arrays;

public class Questionnaire {

    public Questionnaire(Questions[] questions) {
        this.questions = questions;
    }

    public Questions[] getQuestions() {
        return questions;
    }

    public void setQuestions(Questions[] questions) {
        this.questions = questions;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "questions=" + Arrays.toString(questions) +
                '}';
    }

    private Questions[] questions;
    private LocalDate date;
}
