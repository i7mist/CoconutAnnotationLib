package me.tianshili.annotationlib.location;


import me.tianshili.annotationlib.commons.AppState;

/**
 * Created by tianshi on 11/9/17.
 */

public @interface LocationSource {
    String dataID();
    LocationType[] dataTypes();
    LocationPurpose[] purposeCategories();
    String [] purposeDescriptions();
    AppState appStateWhenCollection();
}
