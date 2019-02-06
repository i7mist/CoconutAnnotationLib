package me.tianshili.annotationlib.network;

/**
 * Created by tianshi on 11/30/17.
 */

public @interface NetworkAnnotation {
    String [] retentionTime();
    String [] destination();
    String [] purposeDescription();
    boolean [] encryptedInTransmission();
}
