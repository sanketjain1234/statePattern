package com.sanket.designPattern.TVState;

public class TVStartStateImpl extends TVAbstractState {

    private TVStateOptions tvState;

    public TVStartStateImpl(TVStateOptions tvState){
        this.tvState = tvState;
    }

    @Override
    public void performStateAction() {
        System.out.println("Performing Action: " + tvState);

    }
}
