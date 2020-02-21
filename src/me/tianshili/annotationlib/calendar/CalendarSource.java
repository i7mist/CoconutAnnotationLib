package me.tianshili.annotationlib.calendar;

import me.tianshili.annotationlib.commons.*;
/**
 * Created by tianshi on 12/4/17.
 */

public @interface CalendarSource {
    String dataSourceID();
    CalendarDataType[] dataTypes();
    CalendarUsageRationale rationaleCategory();
    String rationaleExplanation();
    Visibility dataCollectionVisibility();
    JitNoticeFrequency jitNoticeDefaultFrequency();
}
