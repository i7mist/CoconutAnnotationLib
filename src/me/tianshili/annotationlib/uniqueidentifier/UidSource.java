package me.tianshili.annotationlib.uniqueidentifier;

import me.tianshili.annotationlib.commons.JitNoticeFrequency;
import me.tianshili.annotationlib.commons.Visibility;

/**
 * Created by tianshi on 1/20/18.
 */

public @interface UidSource {
    String dataSourceID();
    UidDataType[] dataTypes();
    UidUsageRationale rationaleCategory();
    String rationaleExplanation();
    Visibility dataCollectionVisibility();
    JitNoticeFrequency jitNoticeDefaultFrequency();
}
