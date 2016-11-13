package me.fanjie.similaritycheck;

import android.app.Application;

/**
 * Created by fanji on 2016/11/13.
 */

public class App extends Application {
    private static App app;

    public static App getInstance() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
