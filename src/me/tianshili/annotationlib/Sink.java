package me.tianshili.annotationlib;

public @interface Sink {
    Source [] sources();
    int purposeText();
    String caller() default "";
}
