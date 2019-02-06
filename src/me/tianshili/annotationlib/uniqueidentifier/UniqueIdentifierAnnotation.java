package me.tianshili.annotationlib.uniqueidentifier;

/**
 * Created by tianshi on 1/20/18.
 */

public @interface UniqueIdentifierAnnotation {
    UIDPurpose[] purpose();
    String[] purposeDescription();
    UIDType[] uidType();
    UIDScope[] scope();
    UIDResettability[] resettability();
}
