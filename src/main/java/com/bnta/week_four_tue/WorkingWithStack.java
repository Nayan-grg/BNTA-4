package com.bnta.week_four_tue;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        //creating a stack
        Stack<String> stack=new Stack<>();
        stack.push("hello");
        System.out.println(stack.size());
        stack.add("bye");
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.toString());


    }
}
