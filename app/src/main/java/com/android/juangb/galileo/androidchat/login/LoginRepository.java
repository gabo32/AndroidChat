package com.android.juangb.galileo.androidchat.login;

/**
 * Created by JuanHPG on 03/07/2016.
 */
public interface LoginRepository {
    void signUp(String email,String password);
    void signIn(String email,String password);
    void checkSession();

}
