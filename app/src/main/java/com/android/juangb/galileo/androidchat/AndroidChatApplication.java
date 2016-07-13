package com.android.juangb.galileo.androidchat;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;


/**
 * Created by JuanHPG on 03/07/2016.
 */
public class AndroidChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
    }

    private void setupFirebase(){
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
