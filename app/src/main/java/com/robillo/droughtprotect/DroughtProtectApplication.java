package com.robillo.droughtprotect;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class DroughtProtectApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Raleway-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
