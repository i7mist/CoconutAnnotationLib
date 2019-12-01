package me.tianshili.annotationlib.userinput;

import me.tianshili.annotationlib.commons.AppState;

public @interface UserInputSource {
    String dataID();
    UserInputDataType[] dataTypes();
    UserInputPurpose[] purposeCategories();
    String [] purposeDescriptions();
    AppState appStateAtCollection();
}
