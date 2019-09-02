package me.tianshili.annotationlib.sensors;

public @interface SensorSink {
    String [] IDs();
    String [] purposes();
    String [] dataTypes();
}
