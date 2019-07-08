package me.tianshili.annotationlib.userinput;

import me.tianshili.annotationlib.commons.Visibility;

/**
 * @author Elijah Neundorfer 7/2/19
 * @version 7/2/19
 */
public @interface UserInputAnnotation {
    String[] dataType();
    Visibility[] visibility();
    String[] purposeDescription();
}