package me.tianshili.annotationlib.calllogs;

import me.tianshili.annotationlib.commons.Visibility;

/**
 * Created by tiffany on 5/18/17.
 */

public @interface CallLogsAnnotation {
    String ID();
    CallLogsDataType[] dataType();
    // visibility and access frequency are relatively easier to acquire using dynamic analysis. Not sure if we are gonna include them
    // Let developers specify them can be helpful when generating privacy policy/in-app notices. However, I doubt developers can not infer that very accurately.
    Visibility[] visibility();
    // Now destination field contains all possible destinations of data flows generated from this source.
    // Now purpose field contains all possible purposes of data use generated from this source.
    CallLogsPurpose[] purpose();
    String [] purposeDescription();
}
