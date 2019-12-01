package me.tianshili.annotationlib.microphone;

import me.tianshili.annotationlib.commons.AppState;

/**
 * @author elijahneundorfer on 6/3/19
 * @version 6/4/19
 */
public @interface MicrophoneSource {
    String dataID();
    MicrophoneType[] dataTypes();
    MicrophonePurpose[] purposeCategories();
    String [] purposeDescriptions();
    AppState appStateAtCollection();
}
