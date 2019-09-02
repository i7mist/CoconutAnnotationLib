package me.tianshili.annotationlib.calllogs;

public @interface CallLogsSink {
    String [] IDs();
    String [] purposes();
    String [] dataTypes();
}
