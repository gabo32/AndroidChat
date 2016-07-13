package com.android.juangb.galileo.androidchat.login;

import android.util.Log;

import com.android.juangb.galileo.androidchat.lib.EventBus;
import com.android.juangb.galileo.androidchat.lib.GreenRobotEventBus;
import com.android.juangb.galileo.androidchat.login.events.LoginEvent;
import com.android.juangb.galileo.androidchat.login.ui.LoginView;

import org.greenrobot.eventbus.Subscribe;


/**
 * Created by JuanHPG on 03/07/2016.
 */
public class LoginPresenterImpl implements LoginPresenter{
    private EventBus eventBus;
    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView){
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
        this.eventBus = GreenRobotEventBus.getInstance();
    }

    @Override
    public void onCreate() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
        eventBus.unregister(this);
    }

    @Override
    public void checkForAuthenticatedUser() {
        if(loginView != null){
            loginView.disableInputs();
            loginView.showProgressBar();
        }

        loginInteractor.checkSession();
    }

    @Override
    public void validateLogin(String email, String password) {
        if(loginView != null){
            loginView.disableInputs();
            loginView.showProgressBar();
        }

        loginInteractor.doSignIn(email,password);
    }

    @Override
    public void registerNewUser(String email, String password) {
        if(loginView != null){
            loginView.disableInputs();
            loginView.showProgressBar();
        }

        loginInteractor.doSignUp(email,password);
    }

    @Override
    @Subscribe
    public void onEventMainThread(LoginEvent event) {
        switch (event.getEventType()){
            case LoginEvent.onsignInSuccess:
                onSignInSuccess();
                break;
            case LoginEvent.onFiledToRecoverSession:
                onFiledToRecoverSession();
                break;
            case LoginEvent.onSignInError:
                onSignInError(event.getErrorMessage());
                break;
            case LoginEvent.onSignUpError:
                onSignUpError(event.getErrorMessage());
                break;
            case LoginEvent.onSignUpSuccess:
                onSignUpSuccess();
                break;
            
                
                
        }
    }

    private void onFiledToRecoverSession() {
        if(loginView != null){
            loginView.hideProgressBar();
            loginView.enableInputs();

        }
        Log.e("loginPresenterImpe","ha ocurrido un eror");
    }

    private void onSignInSuccess(){
        if(loginView!= null){
            loginView.navigateToMainScreen();
        }
    }

    private void onSignUpSuccess(){
        if(loginView != null){
            loginView.newUserSuccess();
        }
    }

    private void onSignInError(String error){
        if(loginView != null){
            loginView.hideProgressBar();
            loginView.enableInputs();
            loginView.loginError(error);
        }
    }

    private void onSignUpError(String error){
        if(loginView != null){
            loginView.hideProgressBar();
            loginView.enableInputs();
            loginView.newUserError(error);
        }
    }


}
