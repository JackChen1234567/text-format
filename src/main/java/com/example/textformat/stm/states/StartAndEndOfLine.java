package com.example.textformat.stm.states;

import com.example.textformat.enumerations.WordPositionState;
import com.example.textformat.factories.StateFactory;
import com.example.textformat.stm.TextInfo;

public class StartAndEndOfLine extends WordPosition {
    @Override
    public void doAction(TextInfo textInfo) {
        String currentWord = textInfo.getWords().get(textInfo.getWordPositionIndex());
        textInfo.getNewLines().add(textInfo.getCurrentLine());
        textInfo.setCurrentLine(currentWord);
    }

    @Override
    public WordPosition nextState(TextInfo textInfo) {
        if (textInfo.getWordPositionIndex() == textInfo.getWords().size() - 2) {
            return StateFactory.create(WordPositionState.END_STATE);
        }
        return textInfo.getCurrentLine().length() < textInfo.getLineWidth() ? StateFactory.create(WordPositionState.START_OF_LINE) : StateFactory.create(WordPositionState.START_AND_END_OF_LINE);
    }
}
