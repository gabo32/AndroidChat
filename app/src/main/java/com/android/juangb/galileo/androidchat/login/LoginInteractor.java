package com.android.juangb.galileo.androidchat.login;

/**
 * Created by JuanHPG on 03/07/2016.
 */
public interface LoginInteractor {
    void checkSession();
    void doSignUp(String email,String password);
    void doSignIn(String email,String password);
}
