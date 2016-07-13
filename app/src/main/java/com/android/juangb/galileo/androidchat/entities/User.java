package com.android.juangb.galileo.androidchat.entities;

import java.util.Map;

/**
 * Created by JuanHPG on 03/07/2016.
 */
public class User {
    private String email;
    private boolean online;

    private Map<String,Boolean> contacts;

    public final static boolean ONLINE = true;
    public final static boolean OFFLINE = false;

    public User(){
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public Map<String, Boolean> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, Boolean> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object obj){
        boolean equal = false;

        if(obj instanceof User){
            User recipe = (User)obj;
            equal = this.email.equals(recipe.getEmail());
        }

        return equal;
    }
}
