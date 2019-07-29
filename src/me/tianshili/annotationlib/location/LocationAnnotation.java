package me.tianshili.annotationlib.location;


import me.tianshili.annotationlib.commons.Visibility;

/**
 * Created by tianshi on 11/9/17.
 */

public @interface LocationAnnotation {
    // Currently, each field is independent with other fields.
    // TODO: after integrating dataflow analysis, we will substitute data destination field with another annotation that specifies the justification for leaking the data.
    // TODO: after integrating dataflow analysis, we will move the purpose field to function/class level
    // TODO: add default options after integrating dataflow analysis
    String ID();
    LocationDataType[] dataType();
    // visibility and access frequency are relatively easier to acquire using dynamic analysis. Not sure if we are gonna include them
    // Let developers specify them can be helpful when generating privacy policy/in-app notices. However, I doubt developers can not infer that very accurately.
    Visibility[] visibility();
    // Now destination field contains all possible destinations of data flows generated from this source.
    // Now purpose field contains all possible purposes of data use generated from this source.
    LocationPurpose[] purpose();
    String [] purposeDescription();
    String [] frequency();
}
