package me.tianshili.annotationlib.userfiles;

import me.tianshili.annotationlib.commons.AppState;

public @interface UserFileSource {
    String dataID();
    UserFileType[] dataTypes();
    UserFilePurpose[] purposeCategories();
    String [] purposeDescriptions();
    AppState appStateWhenCollection();
}
