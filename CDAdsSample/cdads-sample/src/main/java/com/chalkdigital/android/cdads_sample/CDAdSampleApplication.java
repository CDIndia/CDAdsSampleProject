package com.chalkdigital.android.cdads_sample;

import android.app.Application;

import com.chalkdigital.common.CDAdsUtils;
import com.chalkdigital.interstitial.ads.CDAdInterstitial;

import java.util.logging.Level;


/**
 * Created by arungupta on 11/01/18.
 */

public class CDAdSampleApplication extends Application {
    public static CDAdInterstitial mCDAdInterstitial;
    @Override
    public void onCreate() {
        super.onCreate();
        CDAdsUtils.initialize(this);
//        CDAdsUtils.setGDPR(true);
//        CDAdsUtils.setConsent(true);
        CDAdsUtils.setLogLevel(Level.ALL);

        CDAdsUtils.setGeoIpLocationEnabled(false);
    }
}
