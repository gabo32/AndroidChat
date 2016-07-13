package com.android.juangb.galileo.androidchat.contactlist;

/**
 * Created by JuanHPG on 05/07/2016.
 */
public interface ContactListSessionInteractor {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}

