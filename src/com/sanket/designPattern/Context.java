package com.sanket.designPattern;

import com.sanket.designPattern.TVState.*;

import java.util.HashMap;

public class Context {

    private TVAbstractState tvState;
    private static HashMap<TVStateOptions, TVAbstractState> stateMap = new HashMap<TVStateOptions, TVAbstractState>();

    static {

        stateMap.put(TVStateOptions.TV_MISC, new TVMiscStateImpl(TVStateOptions.TV_MISC));

        stateMap.put(TVStateOptions.TV_MUTE, new TVMuteStateImpl(TVStateOptions.TV_MUTE));

        stateMap.put(TVStateOptions.TV_START, new TVStartStateImpl(TVStateOptions.TV_START));

        stateMap.put(TVStateOptions.TV_STOP, new TVStopStateimpl(TVStateOptions.TV_STOP));

    }

    public TVAbstractState getTvState() {
        return tvState;
    }

    public void setTvState(TVStateOptions tvState) {
        this.tvState = stateMap.get(tvState);
    }


    public void doAction() {
        this.tvState.performStateAction();
    }


}
