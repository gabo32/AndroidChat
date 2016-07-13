package com.android.juangb.galileo.androidchat.login;

import com.android.juangb.galileo.androidchat.login.events.LoginEvent;

import org.greenrobot.eventbus.Subscribe;

/**
 * Created by JuanHPG on 03/07/2016.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email,String password);
    void registerNewUser(String email,String password);
    @Subscribe
    void onEventMainThread(LoginEvent event);
}
