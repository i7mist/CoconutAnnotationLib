package me.tianshili.annotationlib.calllogs;

import me.tianshili.annotationlib.commons.JitNoticeFrequency;
import me.tianshili.annotationlib.commons.Visibility;

/**
 * Created by tiffany on 5/18/17.
 */

public @interface CallLogsSource {
    String dataSourceID();
    CallLogsDataType[] dataTypes();
    CallLogsUsageRationale rationaleCategory();
    String rationaleExplanation();
    Visibility dataCollectionVisibility();
    JitNoticeFrequency jitNoticeDefaultFrequency();
}
