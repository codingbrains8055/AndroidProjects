package com.example.controlflow;

import java.lang.String;
import android.util.Log;

public class ControlFlow {
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'q', 'r', 's',
    't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public void start(){
        char[] sentenceToTest = toCharecterArray("The quick brown fox ju,ped upon the lazy dog");
        char[] missingletters = new char[26];

        int numOfMissingLetters = 0;
        for(int i = 0; i < alphabet.length; i++){
            char letterToFind = alphabet[i];
            if(hasLetter(letterToFind, sentenceToTest)){
                missingletters[numOfMissingLetters] = letterToFind;
                numOfMissingLetters++ ;
            }
        }

        writeSuccess(numOfMissingLetters, missingletters, sentenceToTest);
    }

    public char[] toCharecterArray(String s){
        if(s == null){
            return null;
        }

        char array[] = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            array[i] = s.charAt(i);
        }
        return array;
    }

    public void writeSuccess(int aNumMisssing, char [] aMissingLetter, char [] aSentence){
        Log.e("OPERATOR","Testing sentence"+String.valueOf(aSentence));
        String message = String.valueOf(aNumMisssing) + "missing: "+String.valueOf(aMissingLetter);
        Log.e("OPERATOR",message);
    }

    public boolean hasLetter(char letter, char[] sentence){
        boolean found = false;
        int position = 0;
        while (!found){
            if(letter == sentence[position]) {
                // found if
                found = true;
            }else if(position == sentence.length - 1){
                // the end
                break;
            }else{
                //increment the position in the array
                position++;
            }
        }
        return found;

    }

}