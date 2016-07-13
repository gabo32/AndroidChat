package com.android.juangb.galileo.androidchat.login.ui;

/**
 * Created by JuanHPG on 03/07/2016.
 */
public interface LoginView {
    void enableInputs();
    void disableInputs();
    void showProgressBar();
    void hideProgressBar();

    void handleSingUp();
    void handleSignIn();

    void navigateToMainScreen();
    void loginError(String error);

    void newUserSuccess();
    void newUserError(String error);
}
