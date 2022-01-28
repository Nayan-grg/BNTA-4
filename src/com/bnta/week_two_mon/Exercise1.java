package com.bnta.week_two_mon;

public class Exercise1 {
    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
    public static void main(String[] args) {
//        String string="whatever";
//        String reverse = new StringBuffer(string).reverse().toString();
//        System.out.println(reverse);
        String output= reverse("TODO");
        System.out.println(output);
    }
    static String reverse(String input){
        String output="";
        for(int i=input.length()-1; i>=0;i--){
            output += input.charAt(i);
        }
        return output ;
    }

    // invoke your function here
}

////
////
////        }
////
////
////    }
////
////
//public class exercise1 {
//
//    public static void main(String[] args) {
//        String[] text = {"test", "a", "only", "is", "This"};
//        reverse("this is a test");
//
//        static String reverse(String text){
//            for (int i = text.length - 1; i >= 0; i--)
//                System.out.print(text[i] + " ");
//        }
//    }
//}