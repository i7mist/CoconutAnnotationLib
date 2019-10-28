package me.tianshili.annotationlib.network;

public @interface NetworkSink {
    String [] dataIDs();
    String [] dataDescriptions();
    RetentionType[] retentionTypes();
    SharingTargetType[] sharingTargetTypes();
}
