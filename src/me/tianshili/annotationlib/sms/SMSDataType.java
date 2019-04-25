package me.tianshili.annotationlib.sms;

/**
 * Created by tiffany on 4/19/19.
 */

public enum SMSDataType {
    //BaseMmsColumns
    LOCATION, //CONTENT_LOCATION
    CREATOR, //CREATOR
    DATE_AND_TIME, //DATE, DATE_SENT, DELIVERY_TIME
    MESSAGE_ID, //MESSAGE_ID
    STATUS, //STATUS, SEEN, RESPONSE_STATUS, SEEN_STATUS, READ_STATUS, READ
    TEXT, //SUBJECT, RESPONSE_TEXT

    //CanonicalAddressesColumns
    ADDRESS, //ADDRESS (address used in MMS or SMS)

    CONTENT_URI,

    UNKNOWN
}
