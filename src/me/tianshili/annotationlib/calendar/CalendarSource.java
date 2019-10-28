package me.tianshili.annotationlib.calendar;

import me.tianshili.annotationlib.commons.*;
/**
 * Created by tianshi on 12/4/17.
 */

public @interface CalendarSource {
    String dataID();
    CalendarDataType[] dataTypes();
    CalendarPurpose[] purposeCategories();
    String [] purposeDescriptions();
    AppState appStateWhenCollection();
}
