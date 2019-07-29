package me.tianshili.annotationlib.sensors;

/**
 * @author Elijah Neundorfer 6/17/19
 * @version 6/17/19
 */
public enum SensorPurpose {
    step_counter, //Count users' steps
    game_input_controller, //Detect device movements to control game input
    navigation_or_map_or_compass, //Use dead reckoning to improve localization
    speaker_or_display_activation, //Turn off screen if the phone is near the users’ ear
    other_purposes_explained_in_text,
    UNKNOWN
}
