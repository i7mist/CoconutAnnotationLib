package me.tianshili.annotationlib.location;


import me.tianshili.annotationlib.commons.Visibility;

/**
 * Created by tianshi on 11/9/17.
 */

public @interface LocationSource {
    // Currently, each field is independent with other fields.
    // TODO: after integrating dataflow analysis, we will substitute data destination field with another annotation that specifies the justification for leaking the data.
    // TODO: after integrating dataflow analysis, we will move the purpose field to function/class level
    // TODO: add default options after integrating dataflow analysis
    String ID();
    String [] purpose();
}
