package com.enumerations;

public class AskMe {
    public static void main(String[] args){
        Question question = new Question();
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
    }

    static void answer(Answers answers){
        switch (answers){
            case MAYBE:System.out.println("May be");
            break;
            case NEVER:System.out.println("Never");
                break;
            case SOON:System.out.println("Soon");
                break;
            case YES:System.out.println("Yes");
                break;
            case LATER:System.out.println("Later");
                break;
            case NO:System.out.println("No");
                break;
        }
    }
}
