package com.Dictionary;

class Word {
    private String word;
    private String definition;
    int hashKey;
    Word(String word, String definition){
        this.word=word;
        this.definition=definition;
    }
    Word next;
    public String toString(){
        return this.word+" : "+this.definition;
    }
}
