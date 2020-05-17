package com.sanket.designPattern.TVState;

public class TVMuteStateImpl extends  TVAbstractState {
    private TVStateOptions tvState;

    public TVMuteStateImpl(TVStateOptions tvState){
        this.tvState = tvState;
    }

    @Override
    public void performStateAction() {
        System.out.println("Performing Action: " + tvState);

    }
}
