package me.fanjie.similaritycheck.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import me.fanjie.similaritycheck.App;
import me.fanjie.similaritycheck.utils.C;

/**
 * Created by fanji on 2016/11/13.
 */

public class DataCenter {
    public static String facesetId;

    static {
        facesetId = getFacesetId();
    }

    public static String getFacesetId(){
        SharedPreferences preferences = App.getInstance().getSharedPreferences(C.FACESET_ID, Context.MODE_PRIVATE);
        return preferences.getString(C.FACESET_ID,null);
    }

    public static void setFacesetId(String facesetId){
        SharedPreferences preferences = App.getInstance().getSharedPreferences(C.FACESET_ID, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = preferences.edit();
        if(TextUtils.isEmpty(facesetId)){
            edit.clear();
        }else {
            edit.putString(C.FACESET_ID, facesetId);
            edit.commit();
        }
    }
}
