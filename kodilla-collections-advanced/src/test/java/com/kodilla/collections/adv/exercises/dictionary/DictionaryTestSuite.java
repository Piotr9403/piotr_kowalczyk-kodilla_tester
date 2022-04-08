package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void testAddWord() {
        //given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartofSpeech.NOUN, "stack");
        //when
        dictionary.addWord(polishWord, englishWord);
        //then
        assertEquals(1, dictionary.size());
    }

    @Test
    public void findEnglishWords() {
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartofSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartofSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartofSpeech.NOUN, "game"));
        dictionary.addWord("grać", new EnglishWord(PartofSpeech.NOUN, "play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWords("gra");
        //then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartofSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartofSpeech.NOUN, "game"));
//        assertEquals(2,result.size());
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindEnglishWord_withPartofSpeech(){
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartofSpeech.NOUN, "stack"));
        dictionary.addWord("brać", new EnglishWord(PartofSpeech.NOUN, "brotherhood"));
        dictionary.addWord("brać", new EnglishWord(PartofSpeech.NOUN, "take"));
        dictionary.addWord("grać", new EnglishWord(PartofSpeech.NOUN, "play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWords("brać", PartofSpeech.NOUN);
        //then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartofSpeech.NOUN, "brotherhood"));
        expectedList.add(new EnglishWord(PartofSpeech.NOUN, "take"));
        assertEquals(expectedList, result);
    }

}