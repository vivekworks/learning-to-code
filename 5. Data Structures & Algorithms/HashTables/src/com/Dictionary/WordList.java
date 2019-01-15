package com.Dictionary;

class WordList {
    private Word firstWord = null;
    void insert(Word newWord, int hashKey){
        newWord.hashKey=hashKey;
        Word previousWord = null;
        Word currentWord=firstWord;
        while(currentWord != null && currentWord.hashKey < newWord.hashKey){
            previousWord=currentWord;
            currentWord=currentWord.next;
        }
        if(previousWord==null)
            firstWord=newWord;
        else
            previousWord.next=newWord;
        newWord.next=currentWord;
    }
    Word findWord(String theWord, int hashKey){
        Word searchWord = firstWord;
        Word previous = null;
        while(searchWord != null &&  searchWord.hashKey < hashKey){
            previous = searchWord;
            searchWord = searchWord.next;
            if(searchWord == null)
                break;
        }
        if(previous != null)
            return previous;
        else
            return searchWord;
    }
    void displayTheList(){
        Word current = firstWord;
        while(current != null){
            System.out.println(current);
            current=current.next;
        }
    }
    public static void main(String[] args){
        TheHashTable hashTable = new TheHashTable(11);
        System.out.println(hashTable.find("ae"));
        hashTable.displayTheTable();
    }
}
