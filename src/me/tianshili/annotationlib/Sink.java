package me.tianshili.annotationlib;

public @interface Sink {
    int sinkData();
    int purposeName();
    Source [] sources();
}
