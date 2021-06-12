package main.java;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public String setString(String string) {
        myString = string;
        return string;
    }

    @Override
    public boolean detectCapitalUse() {
        String word = getString();
        int caps = 0;
        //count how many characters in the string is Capital case
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                caps += 1;
            }
        }
        //if all characters are Uppercase (number of Uppercase characters = length of word)
        // or if all characters are Lowercase (number of Uppercase characters = 0)
        // or if only one character is Uppercase and that character has to be the first character in the String
        // then it's true
        if (caps == word.length() || caps == 0 || ((caps == 1) && Character.isUpperCase(word.charAt(0))))
            return true;
        return false;

    }

}

