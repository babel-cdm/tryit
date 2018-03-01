package es.babel.tryit;


import android.app.Application;

import io.realm.Realm;

public class TryItApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
