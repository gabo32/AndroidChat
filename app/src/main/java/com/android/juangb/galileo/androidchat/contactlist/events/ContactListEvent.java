package com.android.juangb.galileo.androidchat.contactlist.events;

import com.android.juangb.galileo.androidchat.entities.User;

/**
 * Created by JuanHPG on 05/07/2016.
 */
public class ContactListEvent {
    public final static int onContactAdded = 0;
    public final static int onContactChanged = 1;
    public final static int onContactRemoved = 2;

    private int eventType;
    private User user;

    public int getEventType() {
        return eventType;
    }

    public User getUser() {
        return user;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
