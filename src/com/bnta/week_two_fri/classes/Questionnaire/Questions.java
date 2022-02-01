package com.bnta.week_two_fri.classes.Questionnaire;

public class Questions {
    @Override
    public String toString() {
        return "Questions{" +
                "question='" + question + '\'' +
                '}';
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    private String question;
}
