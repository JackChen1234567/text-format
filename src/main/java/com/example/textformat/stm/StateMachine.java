package com.example.textformat.stm;

import com.example.textformat.enumerations.WordPositionState;
import com.example.textformat.factories.StateFactory;
import com.example.textformat.stm.states.WordPosition;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class StateMachine {
    private WordPosition currentState;
    private TextInfo textInfo;

    public StateMachine(List<String> words, int lineWidth) {
        textInfo = new TextInfo();
        textInfo.setWords(words);
        textInfo.setLineWidth(lineWidth);
        currentState = StateFactory.create(WordPositionState.INITIAL);
        textInfo.setNewLines(new ArrayList<>());
        textInfo.setCurrentLine("");
    }

    public void process(int wordPositionIndex) {
        textInfo.setWordPositionIndex(wordPositionIndex);
        currentState.doAction(textInfo);
        currentState = currentState.nextState(textInfo);
    }
}
