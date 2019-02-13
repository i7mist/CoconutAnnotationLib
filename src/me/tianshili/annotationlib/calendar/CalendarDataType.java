package me.tianshili.annotationlib.calendar;

/**
 * Created by tianshi on 12/4/17.
 */

public enum  CalendarDataType {
    // Calendars table

    //TODO: add fields from ExtendedProperties column

    CALENDAR_DISPLAY_NAME, // CALENDAR_DISPLAY_NAME
    CALENDAR_OWNER, //OWNER_ACCOUNT

    CALENDAR_ID, //CALENDAR_ID from events, attendees table

    // Events table
    EVENT_TITLE,
    EVENT_DESCRIPTION,
    EVENT_LOCATION,
    EVENT_ORGANIZER, //email of organizer of event
    EVENT_TIME, // DTSTART, DTEND, DURATION, ALL_DAY, RRULE, RDATE, EXRULE, EXDATE
    // Attendees table
    EVENT_ATTENDEE, // ATTENDEE_NAME, ATTENDEE_EMAIL, ATTENDEE_RELATIONSHIP

    // Attendees table
    ATTENDEE_INFO, //ATTENDEE_EMAIL, ATTENDEE_IDENTITY, ATTENDEE_NAME
    ATTENDEE_RELATIONSHIP, //integer values
    ATTENDEE_STATUS, //integer values
    ATTENDEE_TYPE, //integer values


    UNKNOWN


}

