package com.sanket.designPattern.TVState;

public class TVMiscStateImpl extends TVAbstractState {
    private TVStateOptions tvState;

    public TVMiscStateImpl(TVStateOptions tvState){
        this.tvState = tvState;
    }

    @Override
    public void performStateAction() {
        System.out.println("Performing Action: " + tvState);

    }
}
