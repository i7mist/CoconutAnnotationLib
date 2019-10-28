package me.tianshili.annotationlib.camera;

import me.tianshili.annotationlib.commons.AppState;

/**
 *
 * @author elijahneundorfer on 6/3/19
 */
public @interface CameraSource {
    String dataID();
    CameraType[] dataTypes();
    CameraPurpose[] purposeCategories();
    String [] purposeDescriptions();
    AppState appStateWhenCollection();
}
