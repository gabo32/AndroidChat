package com.android.juangb.galileo.androidchat.contactlist;

/**
 * Created by JuanHPG on 05/07/2016.
 */
public interface ContactListRepository {
    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void subscribeToContactListEvents();
    void destroyListener();
    void unsuscribeToContactListEvents();
    void changeConnectionStatus(boolean online);
}
