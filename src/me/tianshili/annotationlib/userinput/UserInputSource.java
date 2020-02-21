package me.tianshili.annotationlib.userinput;

import me.tianshili.annotationlib.commons.JitNoticeFrequency;
import me.tianshili.annotationlib.commons.Visibility;

public @interface UserInputSource {
    String dataSourceID();
    UserInputDataType [] dataTypes();
    UserInputUsageRationale rationaleCategory();
    String rationaleExplanation();
    Visibility dataCollectionVisibility();
    JitNoticeFrequency jitNoticeDefaultFrequency();
}
