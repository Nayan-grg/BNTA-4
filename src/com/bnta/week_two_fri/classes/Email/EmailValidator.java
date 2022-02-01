package com.bnta.week_two_fri.classes.Email;

public class EmailValidator {
    public boolean validateEmail(String email){
        String[] company={"gmail","live","hotmail","yahoo"};
        boolean isValid = false;
        for (int i = 0; i < company.length; i++) {
            if(email.contains(company[i])){
                isValid=true;
            }else{
                break;
            }
            if(email.contains("@")){
                isValid=true;
                if(email.substring(email.length()-4, email.length()).equals(".com")){
                    isValid=true;
                }else{
                    break;
                }
            }else{
                break;
            }
        }


        return isValid;
    }
}
