package me.tianshili.annotationlib.uniqueidentifier;

/**
 * Created by tianshi on 11/9/17.
 */

public enum UidUsageRationale {
    TRACKING_DATA_COLLECTED_WITHIN_APP,
    TRACKING_DATA_COLLECTED_FROM_OTHER_APPS,
    HANDLE_MULTIPLE_INSTALLS,
    ENFORCING_FREE_CONTENT_LIMITS,
    MANAGING_TELEPHONY_AND_CARRIER_FUNCTIONALITY,
    IDENTIFYING_BOTS_AND_DDOS_ATTACKS, // In this case, you are trying to detect multiple fake devices attacking your backend services.
    DETECTING_HIGH_VALUE_STOLEN_CREDENTIALS, // In this case, you are trying to detect if a single device is being used multiple times with high-value, stolen credentials (e.g. to make fraudulent payments)
    OTHER_PURPOSES,
    UNKNOWN,
}