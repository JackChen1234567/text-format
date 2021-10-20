package com.example.textformat.stm.states;

import com.example.textformat.enumerations.WordPositionState;
import com.example.textformat.factories.StateFactory;
import com.example.textformat.stm.TextInfo;

public class EndState extends WordPosition {

    @Override
    public void doAction(TextInfo textInfo) {
        String currentWord = textInfo.getWords().get(textInfo.getWordPositionIndex());
        String newLine = textInfo.getCurrentLine() + " " + currentWord;
        if (newLine.length() > textInfo.getLineWidth()) {
            textInfo.getNewLines().add(textInfo.getCurrentLine());
            textInfo.getNewLines().add(currentWord);
            textInfo.setCurrentLine(currentWord);
        } else {
            textInfo.getNewLines().add(newLine);
        }
    }

    @Override
    public WordPosition nextState(TextInfo textInfo) {
        return StateFactory.create(WordPositionState.INITIAL);
    }
}
