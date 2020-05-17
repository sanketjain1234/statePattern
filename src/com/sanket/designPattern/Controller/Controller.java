package com.sanket.designPattern.Controller;

import com.sanket.designPattern.Context;
import com.sanket.designPattern.TVState.TVStateOptions;

public class Controller {

   private Context context = new Context();

    public void startTv() {
        context.setTvState(TVStateOptions.TV_START);
        context.doAction();
    }

    public void misctv() {
        context.setTvState(TVStateOptions.TV_MISC);
        context.doAction();
    }

    public void muteTv() {
        context.setTvState(TVStateOptions.TV_MUTE);
        context.doAction();
    }

    public void stopTv() {
        context.setTvState(TVStateOptions.TV_STOP);
        context.doAction();
    }
}
