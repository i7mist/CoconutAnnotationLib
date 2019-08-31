package me.tianshili.annotationlib.storage;

/**
 * Created by tianshi on 1/20/18.
 */

public @interface StorageAnnotation {
    String [] egressDescription();
    AccessControlOption [] accessControl();
}
