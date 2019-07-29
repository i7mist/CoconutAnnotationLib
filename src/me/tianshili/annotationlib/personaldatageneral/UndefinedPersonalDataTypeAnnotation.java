package me.tianshili.annotationlib.personaldatageneral;

import me.tianshili.annotationlib.commons.Visibility;

/**
 * Created by tianshi on 2/8/18.
 */
public @interface UndefinedPersonalDataTypeAnnotation {
    String ID();
    String [] purposeDescription();
    String [] dataType();
    // visibility and access frequency are relatively easier to acquire using dynamic analysis. Not sure if we are gonna include them
    // Let developers specify them can be helpful when generating privacy policy/in-app notices. However, I doubt developers can not infer that very accurately.
    Visibility[] visibility();
    // Now destination field contains all possible destinations of data flows generated from this source.
    // Now purpose field contains all possible purposes of data use generated from this source.
    String [] frequency();
}
