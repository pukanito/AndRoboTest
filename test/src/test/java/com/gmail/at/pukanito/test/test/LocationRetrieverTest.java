package com.gmail.at.pukanito.test.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.Robolectric;

import android.app.Application;

@Config(manifest = "src/main/AndroidManifest.xml",
        reportSdk = 18, qualifiers = "v10")
@RunWith(RobolectricTestRunner.class)
public class LocationRetrieverTest {

    @Test
    public void simpleTest() {
//        Robolectric.getShadowApplication().getResourceLoader().
        final Application mockApp = Robolectric.application;
//        mockActivity.getString(R.string.abc_action_bar_home_description);
        new LocationRetriever(mockApp);
    }
}
