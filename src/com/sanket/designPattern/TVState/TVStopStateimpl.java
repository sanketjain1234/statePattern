package com.sanket.designPattern.TVState;

public class TVStopStateimpl extends TVAbstractState {

    private TVStateOptions tvState;

    public TVStopStateimpl(TVStateOptions tvState){
        this.tvState = tvState;
    }

    @Override
    public void performStateAction() {
        System.out.println("Performing Action: " + tvState);

    }
}
