package me.tianshili.annotationlib.location;

/**
 * Created by tianshi on 2/22/18.
 */
public enum LocationPurpose {
    search_nearby_places,
    provide_location_based_content, // merge this with the previous category? Be more specific, like location_based query?
    transportation_information,  // tracking trip for apps like uber
    recording, // recording traces?
    map_and_navigation,
    geosocial_networking,
    geotagging,
    spoofing,
    alert_and_remind,
    location_based_game,
    data_collection_for_analytics,
    data_collection_for_advertising,
    other_purposes_explained_in_text,
    UNKNOWN,
}
