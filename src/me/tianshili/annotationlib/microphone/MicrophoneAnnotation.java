package me.tianshili.annotationlib.microphone;

import me.tianshili.annotationlib.commons.Visibility;

/**
 * @author elijahneundorfer on 6/3/19
 * @version 6/4/19
 */
public @interface MicrophoneAnnotation {
    String ID();
    Visibility[] visibility();
    MicrophoneDataType[] dataType();
    MicrophonePurpose[] purpose();
    String [] purposeDescription();
}
