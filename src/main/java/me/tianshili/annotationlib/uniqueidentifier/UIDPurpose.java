package me.tianshili.annotationlib.uniqueidentifier;

/**
 * Created by tianshi on 11/9/17.
 */

public enum UIDPurpose {
    tracking_user_data_collected_within_this_app,
    tracking_user_data_collected_from_multiple_apps_on_this_device,
    handle_multiple_installations,
    enforcing_free_content_limits, //  Instance ID or GUID
    managing_telephony_and_carrier_functionality,
    identifying_bots_and_DDOS_attacks, // In this case, you are trying to detect multiple fake devices attacking your backend services.
    detecting_high_value_stolen_credentials, // In this case, you are trying to detect if a single device is being used multiple times with high-value, stolen credentials (e.g. to make fraudulent payments)
    other_purposes_explained_in_text,
    UNKNOWN,
}
