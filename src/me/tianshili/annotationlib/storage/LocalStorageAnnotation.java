package me.tianshili.annotationlib.storage;

/**
 * Created by tianshi on 1/20/18.
 */

public @interface LocalStorageAnnotation {
    String [] dataIDs();
    AccessScope accessScope();
    boolean uploadLater();
}
