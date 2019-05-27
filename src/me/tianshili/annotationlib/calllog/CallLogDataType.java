package me.tianshili.annotationlib.calllog;

/**
 * Created by tiffany on 5/18/17.
 */

public enum CallLogDataType {
    //Calls Column
    LAST_OUTGOING_CALL, //method call
    CACHED_DATA, //cached data
    DATE,
    DURATION,
    NUMBER,
    VOICEMAIL_DATA, //VOICEMAIL_URI, TRANSCRIPTION
    UNKNOWN
}
