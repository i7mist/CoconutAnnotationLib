package me.tianshili.annotationlib.sms;

import me.tianshili.annotationlib.commons.*;

/**
 * Created by tiffany on 4/19/19.
 */

public @interface SMSAnnotation {
    String ID();
    SMSDataType[] dataType();
    // visibility and access frequency are relatively easier to acquire using dynamic analysis. Not sure if we are gonna include them
    // Let developers specify them can be helpful when generating privacy policy/in-app notices. However, I doubt developers can not infer that very accurately.
    Visibility[] visibility();
    // Now destination field contains all possible destinations of data flows generated from this source.
    // Now purpose field contains all possible purposes of data use generated from this source.
    SMSPurpose[] purpose();
    String [] purposeDescription();
}
