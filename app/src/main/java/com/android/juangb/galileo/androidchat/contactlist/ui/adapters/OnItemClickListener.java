package com.android.juangb.galileo.androidchat.contactlist.ui.adapters;

import com.android.juangb.galileo.androidchat.entities.User;

/**
 * Created by JuanHPG on 06/07/2016.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);

}
