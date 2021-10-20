package com.example.textformat.stm.states;

import com.example.textformat.stm.TextInfo;

public abstract class WordPosition {
    public abstract void doAction(TextInfo textInfo);

    public abstract WordPosition nextState(TextInfo textInfo);
}
