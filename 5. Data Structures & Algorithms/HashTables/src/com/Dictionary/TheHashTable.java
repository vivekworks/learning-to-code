package com.Dictionary;

class TheHashTable {
    private WordList[] theArray;
    private int arraySize;
    private String[][] data = new String[][]{{"ace", "very good"},
                                        {"act", "take action"}, {"add", "join something"},
                                        {"age", "grow old"}, {"ago", "before the present"},
                                        {"aid", "help, assist, or support"}, {"aim", "point or direct"}};

    TheHashTable(int size) {
        this.arraySize = size;
        theArray=new WordList[size];
        for(int i=0;i<size;i++)
            theArray[i]=new WordList();
        insert();
    }
    private int hashFunction(String word){
        int key=0;
        for(int i=0;i<word.length();i++){
            key = (key*27+(word.charAt(i)-97))%arraySize;
        }
        return key;
    }
    private void insert(){
        for(String[] dataValue :data){
            Word newWord = new Word(dataValue[0],dataValue[1]);
            int key = hashFunction(dataValue[0]);
            newWord.hashKey=key;
            theArray[key].insert(newWord,key);
        }
    }
    Word find(String word){
        int hashKey = hashFunction(word);
        return theArray[hashKey].findWord(word, hashKey);
    }
    void displayTheTable(){
        for(int i=0;i<arraySize;i++){
            theArray[i].displayTheList();
        }
    }
}
