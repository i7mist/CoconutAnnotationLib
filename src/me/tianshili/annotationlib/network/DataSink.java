package me.tianshili.annotationlib.network;

import me.tianshili.annotationlib.network.RetentionType;
import me.tianshili.annotationlib.network.sharingTargetType;

public @interface DataSink {
    String [] dataIDs();
    String [] dataTypes();
    RetentionType[] retentionTypes();
    sharingTargetType[] sharingTargetTypes();
}
