package com.squareup.leakcanary;

import android.app.Application;

import com.squareup.leakcanary.watcher.RefWatcher;

/**
 * A no-op version of {@link LeakCanary} that can be used in release builds.
 */
public final class LeakCanary {

    public static RefWatcher install(Application application) {
        return RefWatcher.DISABLED;
    }

    private LeakCanary() {
        throw new AssertionError();
    }
}
