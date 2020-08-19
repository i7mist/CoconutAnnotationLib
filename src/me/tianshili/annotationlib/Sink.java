package me.tianshili.annotationlib;

public @interface Sink {
    String caller() default "";
    int dataType();
    int purposeName();
    Source [] sources();
    int purposeText() default -1;
    boolean conditional() default false;
}
