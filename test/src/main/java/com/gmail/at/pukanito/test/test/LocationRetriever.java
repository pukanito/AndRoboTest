package com.gmail.at.pukanito.test.test;

import android.content.Context;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.location.LocationClient;

/**
 * Class for getting a location.
 */
public class LocationRetriever implements GooglePlayServicesClient.ConnectionCallbacks,
        GooglePlayServicesClient.OnConnectionFailedListener {

    public LocationRetriever(final Context context) {
        new LocationClient(context, this, this);
    }

    @Override
    public void onConnected(Bundle bundle) {
    }

    @Override
    public void onDisconnected() {
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
    }
}
