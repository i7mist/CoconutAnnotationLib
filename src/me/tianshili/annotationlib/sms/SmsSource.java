package me.tianshili.annotationlib.sms;

import me.tianshili.annotationlib.commons.*;

/**
 * Created by tiffany on 4/19/19.
 */

public @interface SmsSource {
    String dataSourceID();
    SmsDataType [] dataTypes();
    SmsUsageRationale rationaleCategory();
    String rationaleExplanation();
    Visibility dataCollectionVisibility();
    JitNoticeFrequency jitNoticeDefaultFrequency();
}
