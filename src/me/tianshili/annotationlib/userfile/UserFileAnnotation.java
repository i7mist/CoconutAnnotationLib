package me.tianshili.annotationlib.userfile;

import me.tianshili.annotationlib.commons.Visibility;

/**
 * @author Elijah Neundorfer 7/1/19
 * @version 7/1/19
 */
public @interface UserFileAnnotation {
    UserFileDataType[] dataType();
    Visibility[] visibility();
    UserFilePurpose[] purpose();
    String [] purposeDescription();
}
