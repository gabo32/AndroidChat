package com.android.juangb.galileo.androidchat.lib;

/**
 * Created by JuanHPG on 03/07/2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
