package com.yashtongaonkar.myapp.utils;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by Yash T on 08/06/2018
 * Represents application shared preferences
 */
public class AppPreference {

    private static final String FILE_NAME = "myapp.shapf";
    private static final String USER_ID = "userId";

    public static void setUserId(Context context, int value) {
        SharedPreferences preferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        preferences.edit().putInt(USER_ID, value).apply();
    }

    public static int getUserId(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        return preferences.getInt(USER_ID, 0);
    }
}
