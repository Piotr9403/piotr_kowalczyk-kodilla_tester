package com.kodilla.collections.adv.exercises.dictionary;

import java.util.Objects;

public class EnglishWord {
    private PartofSpeech partofSpeech;
    private String word;

    public EnglishWord(PartofSpeech partofSpeech, String word) {
        this.partofSpeech = partofSpeech;
        this.word = word;
    }

    public PartofSpeech getPartofSpeech() {
        return partofSpeech;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return partofSpeech == that.partofSpeech && Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partofSpeech, word);
    }
}
