package com.android.juangb.galileo.androidchat.contactlist;

/**
 * Created by JuanHPG on 05/07/2016.
 */
public interface ContactListInteractor {
    void subscribe();
    void unsubscribe();
    void destroyListener();
    void removeContact(String email);
}
