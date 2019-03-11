package com.string;

public class StringMain {
    public static void main(String[] args){
        try {
            StringConversion stringConversion = new StringConversion();
            stringConversion.basicOperations();
            stringConversion.characterExtraction();
            stringConversion.stringComparison();
            stringConversion.stringSearch();
            stringConversion.stringModification();
            stringConversion.valueOfConversion();
            stringConversion.caseChange();
            stringConversion.joiningStrings();
            StringBuffers stringBuffers = new StringBuffers();
            stringBuffers.constructors();
            stringBuffers.bufferSize();
            stringBuffers.bufferCharacters();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
