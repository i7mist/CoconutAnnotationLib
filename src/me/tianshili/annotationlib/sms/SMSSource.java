package me.tianshili.annotationlib.sms;

import me.tianshili.annotationlib.commons.*;

/**
 * Created by tiffany on 4/19/19.
 */

public @interface SMSSource {
    String dataID();
    SMSType[] dataTypes();
    SMSPurpose[] purposeCategories();
    String [] purposeDescriptions();
    AppState appStateAtCollection();
}
