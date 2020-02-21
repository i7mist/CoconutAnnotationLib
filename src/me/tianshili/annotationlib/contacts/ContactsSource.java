package me.tianshili.annotationlib.contacts;

import me.tianshili.annotationlib.commons.*;

/**
 * Created by tianshi on 4/14/19.
 */

public @interface ContactsSource {
    String dataSourceID();
    ContactsDataType [] dataTypes();
    ContactsUsageRationale rationaleCategory();
    String rationaleExplanation();
    Visibility dataCollectionVisibility();
    JitNoticeFrequency jitNoticeDefaultFrequency();
}
