package me.tianshili.annotationlib.calendar;

import me.tianshili.annotationlib.commons.*;
/**
 * Created by tianshi on 12/4/17.
 */

public @interface CalendarAnnotation {
    CalendarDataType[] dataType();
    // visibility and access frequency are relatively easier to acquire using dynamic analysis. Not sure if we are gonna include them
    // Let developers specify them can be helpful when generating privacy policy/in-app notices. However, I doubt developers can not infer that very accurately.
    Visibility[] visibility();
    // Now destination field contains all possible destinations of data flows generated from this source.
    // Now purpose field contains all possible purposes of data use generated from this source.
    CalendarPurpose[] purpose();
    String [] purposeDescription();
}
