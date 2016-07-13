package com.android.juangb.galileo.androidchat.contactlist;

import com.android.juangb.galileo.androidchat.contactlist.events.ContactListEvent;

/**
 * Created by JuanHPG on 05/07/2016.
 */
public interface ContactListPresenter {
    void onCreate();
    void onDestroy();
    void onPause();
    void onResume();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String name);
    void onEventMainThread(ContactListEvent event);
}
