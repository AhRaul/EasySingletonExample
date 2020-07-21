package com.example.easysingletonexample;

import android.app.Application;

/**
 * class to implement singleton variables like:
 *  -   db
 *  -   shared preferences
 *
 *  used for initial config of persistence
 */

public class AppConfig extends Application {

    private static AppConfig instance;          //доступ к создателю синглтонов
    private SomeSingletone someSingletone;      //синглтон (класс, существующий в приложении
                                                // в единственном экземлляре)

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        someSingletone = new SomeSingletone(this);  //момент создания синглтона
    }

    public static AppConfig getInstance() {
        return instance;
    }

    // для обращения к синглтону
    public SomeSingletone getSomeSingletone() {
        return someSingletone;
    }
}
