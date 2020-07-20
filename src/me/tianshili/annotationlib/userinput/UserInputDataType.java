package me.tianshili.annotationlib.userinput;

public enum UserInputDataType {
    REAL_NAME, // e.g. first name, last name
    USER_NAME, // user id, screen name
    EMAIL,
    PASSWORD,
    FINANCIAL_INFO,
    GOVERNMENT_ISSUED_ID, // SSN, passport ID, national ID, Driver license ID
    CONTACT_INFO,
    PHYSICAL_ADDRESS,
    AGE_INFO, // age, date of birth, referring to COPPA
    SEARCH_QUERIES,
    NOTES,
    DIRECT_MESSAGE, // SMS, Instant messages, meant for private conversations
    FEEDBACK, // feedback on services
    USER_GENERATED_CONTENT, // posts, comment
    FILE_NAME,
    OTHER_INFO,
    // TODO: check wikipedia PII list
    UNKNOWN
}