package me.tianshili.annotationlib.privacynotice;

public @interface PrivacyUI {
    String [] dataIDs();
    PrivacyUIFunctionType [] functionTypes();
}
