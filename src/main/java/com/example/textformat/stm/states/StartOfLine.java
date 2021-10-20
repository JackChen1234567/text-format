package com.example.textformat.stm.states;

import com.example.textformat.enumerations.WordPositionState;
import com.example.textformat.factories.StateFactory;
import com.example.textformat.stm.TextInfo;

public class StartOfLine extends WordPosition {
    private String newLine;

    @Override
    public void doAction(TextInfo textInfo) {
        String currentWord = textInfo.getWords().get(textInfo.getWordPositionIndex());
        newLine = textInfo.getCurrentLine() + " " + currentWord;
        if (newLine.length() > textInfo.getLineWidth()) {
            textInfo.getNewLines().add(textInfo.getCurrentLine());
            textInfo.setCurrentLine(currentWord);
        } else {
            textInfo.setCurrentLine(newLine);
        }
    }

    @Override
    public WordPosition nextState(TextInfo textInfo) {
        if (textInfo.getWordPositionIndex() == textInfo.getWords().size() - 2) {
            return StateFactory.create(WordPositionState.END_STATE);
        }
        return newLine.length() > textInfo.getLineWidth() ? StateFactory.create(WordPositionState.START_OF_LINE) : StateFactory.create(WordPositionState.MIDDLE_OF_LINE);
    }
}
