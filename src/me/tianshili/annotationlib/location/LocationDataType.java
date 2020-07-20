package me.tianshili.annotationlib.location;

/**
 * Created by tianshi on 11/9/17.
 */

public enum LocationDataType {
    FINE_GRAINED_LATITUDE_LONGITUDE,
    COARSE_GRAINED_LATITUDE_LONGITUDE,
    CITY_LEVEL_LATITUDE_LONGITUDE,
    BLOCK_LEVEL_LATITUDE_LONGITUDE,
    ALTITUDE,
    SPEED,
    BEARING,
    HUMAN_READABLE_ADDRESS,
    DISTANCE_TO_A_PLACE,
    WHETHER_WITHIN_AN_AREA,
    UNKNOWN,
}