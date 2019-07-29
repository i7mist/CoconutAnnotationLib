package me.tianshili.annotationlib.camera;

import me.tianshili.annotationlib.commons.Visibility;

/**
 * TODO: This is a skeleton until the camera is implemented in Coconut. The fields need to be updated to accurately reflect what we need
 *
 * @author elijahneundorfer on 6/3/19
 */
public @interface CameraAnnotation {
    String ID();
    CameraDataType[] dataType();
    // visibility and access frequency are relatively easier to acquire using dynamic analysis. Not sure if we are gonna include them
    // Let developers specify them can be helpful when generating privacy policy/in-app notices. However, I doubt developers can not infer that very accurately.
    Visibility[] visibility();
    // Now destination field contains all possible destinations of data flows generated from this source.
    // Now purpose field contains all possible purposes of data use generated from this source.
    CameraPurpose[] purpose();
    String [] purposeDescription();
}
