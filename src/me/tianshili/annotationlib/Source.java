package me.tianshili.annotationlib;

public @interface Source {
    String caller() default "";
    int dataType();
    int purposeName();
    int purposeText() default -1;
    boolean conditional() default false;
}
