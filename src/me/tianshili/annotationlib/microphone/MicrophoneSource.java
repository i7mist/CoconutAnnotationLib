package me.tianshili.annotationlib.microphone;

import me.tianshili.annotationlib.commons.*;

/**
 * @author elijahneundorfer on 6/3/19
 * @version 6/4/19
 */
public @interface MicrophoneSource {
    String dataSourceID();
    MicrophoneDataType [] dataTypes();
    MicrophoneUsageRationale rationaleCategory();
    String rationaleExplanation();
    Visibility dataCollectionVisibility();
    JitNoticeFrequency jitNoticeDefaultFrequency();
}
