package io.palaima.debugdrawer.app;

import androidx.multidex.MultiDexApplication;

import io.palaima.debugdrawer.timber.data.LumberYard;
import timber.log.Timber;

public class DebugDrawerApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        LumberYard lumberYard = LumberYard.getInstance(this);
        lumberYard.cleanUp();

        Timber.plant(lumberYard.tree());
        Timber.plant(new Timber.DebugTree());
    }
}
