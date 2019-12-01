package me.tianshili.annotationlib.uniqueidentifier;

import me.tianshili.annotationlib.commons.AppState;

/**
 * Created by tianshi on 1/20/18.
 */

public @interface UIDSource {
    String dataID();
    UIDType[] dataTypes();
    UIDPurpose[] purposeCategories();
    String[] purposeDescriptions();
    AppState appStateAtCollection();
}
