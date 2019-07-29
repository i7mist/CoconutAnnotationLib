package me.tianshili.annotationlib.sensors;

import me.tianshili.annotationlib.commons.Visibility;

/**
 * @author Elijah Neundorfer 6/17/19
 * @version 6/17/19
 */
public @interface SensorAnnotation {
    String ID();
    SensorDataType[] dataType();
    Visibility[] visibility();
    SensorPurpose[] purpose();
    String [] purposeDescription();
}
