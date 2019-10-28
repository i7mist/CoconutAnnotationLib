package me.tianshili.annotationlib.network;

public @interface NetworkSink {
    String [] dataIDs();
    String [] dataTypes();
    RetentionType[] retentionTypes();
    SharingTargetType[] sharingTargetTypes();
}
