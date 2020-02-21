package me.tianshili.annotationlib.sensors;

import me.tianshili.annotationlib.commons.*;

/**
 * @author Elijah Neundorfer 6/17/19
 * @version 6/17/19
 */
public @interface SensorSource {
    String dataSourceID();
    SensorDataType [] dataTypes();
    SensorUsageRationale rationaleCategory();
    String rationaleExplanation();
    Visibility dataCollectionVisibility();
    JitNoticeFrequency jitNoticeDefaultFrequency();
}
