package com.gmail.at.pukanito.test.test;

import android.content.res.Resources;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;
import org.robolectric.Robolectric;

@SuppressWarnings({"UnusedDeclaration"})
@Implements(Resources.class)
public class ShadowResources extends org.robolectric.shadows.ShadowResources {

    @RealObject private Resources realResources;

    @Implementation
    public String getString(int id) {
        String result;
        try {
            result = Robolectric.directlyOn(realResources, Resources.class).getString(id);
        }
        catch (Exception e) {
            result = "Unknown string";
        }
        return result;
    }

}
