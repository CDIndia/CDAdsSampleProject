package com.chalkdigital.android.cdads_sample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.chalkdigital.ads.CDAdErrorCode;
import com.chalkdigital.interstitial.ads.CDAdInterstitial;

public class DisplayService extends Service implements CDAdInterstitial.InterstitialAdListener {
    public DisplayService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (CDAdSampleApplication.mCDAdInterstitial!=null && CDAdSampleApplication.mCDAdInterstitial.isReady())
        {
            CDAdSampleApplication.mCDAdInterstitial.setInterstitialAdListener(this);
            CDAdSampleApplication.mCDAdInterstitial.show();
        }
        return Service.START_NOT_STICKY;
    }

    @Override
    public void onInterstitialAdRequest(CDAdInterstitial interstitial) {

    }

    @Override
    public void onInterstitialLoaded(CDAdInterstitial interstitial) {

    }

    @Override
    public void onInterstitialFailed(CDAdInterstitial interstitial, CDAdErrorCode errorCode) {

    }

    @Override
    public void onInterstitialShown(CDAdInterstitial interstitial) {

    }

    @Override
    public void onInterstitialClicked(CDAdInterstitial interstitial) {

    }

    @Override
    public void onInterstitialDismissed(CDAdInterstitial interstitial) {
        stopSelf();
    }
}
