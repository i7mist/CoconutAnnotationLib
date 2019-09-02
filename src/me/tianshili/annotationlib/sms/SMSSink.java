package me.tianshili.annotationlib.sms;

public @interface SMSSink {
    String [] IDs();
    String [] purposes();
    String [] dataTypes();
}
