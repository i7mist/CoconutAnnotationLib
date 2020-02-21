package me.tianshili.annotationlib.userfiles;

import me.tianshili.annotationlib.commons.JitNoticeFrequency;
import me.tianshili.annotationlib.commons.Visibility;

public @interface UserFileSource {
    String dataSourceID();
    UserFileDataType [] dataTypes();
    UserFileUsageRationale rationaleCategory();
    String rationaleExplanation();
    Visibility dataCollectionVisibility();
    JitNoticeFrequency jitNoticeDefaultFrequency();
}
