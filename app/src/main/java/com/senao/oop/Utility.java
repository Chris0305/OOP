package com.senao.oop;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import static android.content.ContentValues.TAG;

/**
 * Created by chrisweng on 2017/10/18.
 */

public class Utility {

    public static <T> T covertObj(String content, Class<T> classOfT) {
        Gson gson = new Gson();
        T obj = null;
        try {
            obj = gson.fromJson(content, classOfT);
        } catch (JsonSyntaxException e) {
            Log.e(TAG, "Failed to convert gson:" + content);
            e.printStackTrace();
        }
        return obj;
    }
}
