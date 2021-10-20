package com.example.textformat.factories;

import com.example.textformat.enumerations.WordPositionState;
import com.example.textformat.exceptions.IllegalWordPositionState;
import com.example.textformat.stm.states.*;

public class StateFactory {
    private StateFactory() {}

    public  static WordPosition create(WordPositionState state) {
        switch (state) {
            case INITIAL:
                return new InitState();
            case START_OF_LINE:
                return new StartOfLine();
            case MIDDLE_OF_LINE:
                return new MiddleOfLine();
            case END_STATE:
                return new EndState();
            case START_AND_END_OF_LINE:
                return new StartAndEndOfLine();
            default:
                throw new IllegalWordPositionState("There are no state like this");
        }
    }
}
