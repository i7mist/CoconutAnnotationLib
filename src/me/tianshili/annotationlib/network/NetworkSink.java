package me.tianshili.annotationlib.network;

public @interface NetworkSink {
    String [] dataIDs();
    String [] dataDescriptions();
    RetentionPractice[] retentionTypes();
    SharingPractice[] sharingTargetTypes();
}
