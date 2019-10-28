package me.tianshili.annotationlib.sensors;

/**
 * @author Elijah Neundorfer 6/17/19
 * @version 6/17/19
 */
public enum SensorPurpose {
    STEP_COUNTER, //Count users' steps
    GAME_INPUT_CONTROLLER, //Detect device movements to control game input
    NAVIGATION_OR_MAP_OR_COMPASS, //Use dead reckoning to improve localization
    SPEAKER_OR_DISPLAY_ACTIVATION, //Turn off screen if the phone is near the users’ ear
    OTHER_PURPOSES,
    UNKNOWN
}
