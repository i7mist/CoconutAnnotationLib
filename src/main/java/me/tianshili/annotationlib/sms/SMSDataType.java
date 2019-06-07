package me.tianshili.annotationlib.sms;

/**
 * Created by tiffany on 4/19/19.
 */

public enum SMSDataType {
    //BaseMmsColumns
    LOCATION, //CONTENT_LOCATION
    CREATOR, //CREATOR
    DATE_AND_TIME, //DATE, DATE_SENT, DELIVERY_TIME
    MESSAGES, //MESSAGE_ID, MESSAGE_BOX*
    STATUS, //STATUS, SEEN, RESPONSE_STATUS, SEEN_STATUS, READ_STATUS, READ

    //CanonicalAddressesColumns
    ADDRESS, //ADDRESS (address used in MMS or SMS)

    THREADS,

    UNKNOWN
}
