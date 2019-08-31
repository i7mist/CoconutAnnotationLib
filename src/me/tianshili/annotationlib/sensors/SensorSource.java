package me.tianshili.annotationlib.sensors;

import me.tianshili.annotationlib.commons.Visibility;

/**
 * @author Elijah Neundorfer 6/17/19
 * @version 6/17/19
 */
public @interface SensorSource {
    String ID();
    String [] purposes();
}
