package me.tianshili.annotationlib.sensors;

import me.tianshili.annotationlib.commons.AppState;

/**
 * @author Elijah Neundorfer 6/17/19
 * @version 6/17/19
 */
public @interface SensorSource {
    String dataID();
    SensorType[] dataTypes();
    SensorPurpose[] purposeCategories();
    String [] purposeDescriptions();
    AppState appStateAtCollection();
}
