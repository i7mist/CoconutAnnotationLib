package me.tianshili.annotationlib.personallyidentifiableinformation;

import me.tianshili.annotationlib.commons.Visibility;

/**
 * @author Elijah Neundorfer 7/1/19
 * @version 7/1/19
 */
public @interface PersonallyIdentifiableInformation {
    PersonallyIdentifiableInformationDataType[] dataType();
    Visibility[] visibility();
    PersonallyIdentifiableInformationPurpose[] purpose();
    String [] purposeDescription();
}
