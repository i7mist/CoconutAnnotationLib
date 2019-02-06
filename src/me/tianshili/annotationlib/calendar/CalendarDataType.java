package me.tianshili.annotationlib.calendar;

/**
 * Created by tianshi on 12/4/17.
 */

public enum  CalendarDataType {
    // Calendars table
    CALENDAR_DISPLAY_NAME, // CALENDAR_DISPLAY_NAME
    CALENDAR_OWNER,
    // Events table
    EVENT_TITLE,
    EVENT_OWNER, // specific owner, all owners, owner email address
    EVENT_DESCRIPTION,
    EVENT_LOCATION,
    EVENT_ORGANIZER,
    EVENT_TIME, // DTSTART, DTEND, DURATION, ALL_DAY, RRULE, RDATE
    // Attendees table
    EVENT_ATTENDEE, // ATTENDEE_NAME, ATTENDEE_EMAIL, ATTENDEE_RELATIONSHIP
    UNKNOWN
}
