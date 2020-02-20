package me.tianshili.annotationlib.location;

/**
 * Created by tianshi on 2/22/18.
 */
public enum LocationPurpose {
    SEARCH_NEARBY_PLACES,
    PROVIDE_LOCATION_BASED_CONTENT, // merge this with the previous category? Be more specific, like location_based query?
    TRANSPORTATION_INFORMATION,  // tracking trip for apps like uber
    RECORDING, // recording traces?
    MAP_AND_NAVIGATING,
    GEOSOCIAL_NETWORKING,
    GEOTAGGING,
    SPOOFING,
    ALERT_AND_REMIND,
    LOCATION_BASED_GAME,
    DATA_COLLECTION_FOR_ANALYTICS,
    DATA_COLLECTION_FOR_ADVERTISING,
    OTHER_PURPOSES,
    UNKNOWN,
}