package me.tianshili.annotationlib.userinput;

import me.tianshili.annotationlib.commons.AppState;
import me.tianshili.annotationlib.location.LocationPurpose;
import me.tianshili.annotationlib.location.LocationType;

public @interface UserInputSource {
    String dataID();
    UserInputDataType[] dataTypes();
    UserInputPurpose[] purposeCategories();
    String [] purposeDescriptions();
    AppState appStateWhenCollection();
}
