package com.android.juangb.galileo.androidchat.login.events;

/**
 * Created by JuanHPG on 03/07/2016.
 */
public class LoginEvent {
    public final static int onSignInError = 0;
    public final static int onSignUpError = 1;
    public final static int onsignInSuccess = 2;
    public final static int onSignUpSuccess = 3;
    public final static int onFiledToRecoverSession = 4;

    private int eventType;
    private String errorMessage;

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
