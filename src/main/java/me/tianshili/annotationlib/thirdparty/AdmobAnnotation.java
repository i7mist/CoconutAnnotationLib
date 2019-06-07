package me.tianshili.annotationlib.thirdparty;

/**
 * Created by tianshi on 2/4/18.
 */

public @interface AdmobAnnotation {
//    There are additional location methods for Android and iOS that can be implemented in an app’s code. These methods will only be used in the event that user location data can’t be accessed or you’ve disabled location data for ads in the app’s Settings tab.
//    If location data for ads is enabled in the app’s Settings tab, we will default to the location passed automatically to the SDK.

    boolean [] isLocationDataEnabledInAppSettings();
}
