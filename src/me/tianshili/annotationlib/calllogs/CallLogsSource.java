package me.tianshili.annotationlib.calllogs;

import me.tianshili.annotationlib.commons.AppState;

/**
 * Created by tiffany on 5/18/17.
 */

public @interface CallLogsSource {
    String dataID();
    CallLogsType[] dataTypes();
    CallLogsPurpose[] purposeCategories();
    String [] purposeDescriptions();
    AppState appStateWhenCollection();
}
