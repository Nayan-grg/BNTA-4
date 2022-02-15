package com.bnta.week_four_tue.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String brackets1 = "[{{[(){}]}}[]{}{{(())}}]";
        String brackets2 = "[{{}}[]{}{{(())}}]";
        String brackets3 = "[{}{}{{()}}]";
        String brackets4 = "[{}{{}}]";
        String brackets5 = "[{{}}]";
        String brackets6 = "[{}]";
        String brackets7 = "";
        System.out.println(check(brackets2));

    }

    public static boolean check(String string) {

        String[] array1 = string.split("");
        Stack<String> firstStack = new Stack<>();
        //put things to the stack
        //even number of the length of the stack
        for (String s : array1) {
            if (s.equals("(") || s.equals("[") || s.equals("{")) {
                firstStack.push(s);
            } else if ((s.equals(")")) || (s.equals("]")) || (s.equals("}"))) {
                if (!firstStack.isEmpty()) {
                    if (s.equals(")")) {
                        if (firstStack.peek().equals("(")) {
                            firstStack.pop();
                        }else return false;
                    }
                    if (s.equals("}")) {
                        if (firstStack.peek().equals("{")) {
                            firstStack.pop();
                        }else return false;
                    }
                    if (firstStack.peek().equals("[")) {
                        firstStack.pop();
                    }else return false;
                }
            }


        }
        return firstStack.isEmpty();
    }
}



