package me.tianshili.annotationlib.microphone;

import me.tianshili.annotationlib.commons.Visibility;

/**
 * @author elijahneundorfer on 6/3/19
 */
public @interface MicrophoneAnnotation {
    Visibility[] visibility();
    // Now destination field contains all possible destinations of data flows generated from this source.
    // Now purpose field contains all possible purposes of data use generated from this source.
    MicrophonePurpose[] purpose();
    String [] purposeDescription();
}
