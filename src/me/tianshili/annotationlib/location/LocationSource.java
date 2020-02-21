package me.tianshili.annotationlib.location;


import me.tianshili.annotationlib.commons.*;

/**
 * Created by tianshi on 11/9/17.
 */

public @interface LocationSource {
    String dataSourceID();
    LocationDataType [] dataTypes();
    LocationUsageRationale rationaleCategory();
    String rationaleExplanation();
    Visibility dataCollectionVisibility();
    JitNoticeFrequency jitNoticeDefaultFrequency();
}
