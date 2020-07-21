package com.example.easysingletonexample;

import android.content.Context;
import android.util.Log;

public class SomeSingletone {
    private final String TAG = "SomeSingletone";

    private Context context;

    public SomeSingletone(Context context) {
        this.context = context;
    }

    public void outLog () {
        Log.d(TAG, "outLog: синглтон вызван");
    }
}
