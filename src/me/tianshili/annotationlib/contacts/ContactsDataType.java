package me.tianshili.annotationlib.contacts;

/**
 * Created by tiffany on 3/28/19.
 */

public enum ContactsDataType {
        //DataColumns Table

        RAW_CONTACT_ID, // RAW_CONTACT_ID

    // RawContactsColumns table
        CONTACT_ID, //CONTACT_ID
        CONTACT_EMAIL, //ACCOUNT_NAME
        ACCOUNT_TYPE,
        EVENT_ORGANIZER, //email of organizer of event
        EVENT_TIME, // DTSTART, DTEND, DURATION, ALL_DAY, RRULE, RDATE, EXRULE, EXDATE
        // Attendees table
        EVENT_ATTENDEE, // ATTENDEE_NAME, ATTENDEE_EMAIL, ATTENDEE_RELATIONSHIP

        // ContactsColumns table
        PHOTO_URI, //PHOTO_URI
        PHOTO_THUMBNAIL_URI, //PHOTO_THUMBNAIL_URI
        ATTENDEE_STATUS, //integer values
        ATTENDEE_TYPE, //integer values


        UNKNOWN



}
