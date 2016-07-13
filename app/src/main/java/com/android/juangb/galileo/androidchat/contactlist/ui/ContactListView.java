package com.android.juangb.galileo.androidchat.contactlist.ui;

import com.android.juangb.galileo.androidchat.entities.User;

/**
 * Created by JuanHPG on 05/07/2016.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
