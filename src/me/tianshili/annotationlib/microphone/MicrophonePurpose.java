package me.tianshili.annotationlib.microphone;

/**
 * @author elijahneundorfer on 6/3/19
 */
public enum MicrophonePurpose {
    voice_authentication, //Authenticate users using voices
    audio_streaming, //Make VOIP phone calls
    voice_control, //Use voice to send the command
    speech_recognition, //Turn the speech audio into text
    audio_recording, //Record voice messages
    acoustic_event_detection, //Sense users’ health using microphone
    acoustic_communication, //Decode audios to receive messages
    music, //Record songs
    other_purposes_explained_in_text,
    UNKNOWN
}
