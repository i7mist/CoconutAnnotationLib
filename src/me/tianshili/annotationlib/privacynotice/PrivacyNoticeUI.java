package me.tianshili.annotationlib.privacynotice;

public @interface PrivacyNoticeUI {
    String [] dataIDs();
    PrivacyNoticeType [] noticeInfoList();
//    PrivacyControlType [] controlFunctions();
}
