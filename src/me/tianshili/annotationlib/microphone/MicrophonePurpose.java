package me.tianshili.annotationlib.microphone;

/**
 * @author elijahneundorfer on 6/3/19
 */
public enum MicrophonePurpose {
    VOICE_AUTHENTICATION, //Authenticate users using voices
    AUDIO_STREAMING, //Make VOIP phone calls
    VOICE_CONTROL, //Use voice to send the command
    SPEECH_RECOGNITION, //Turn the speech audio into text
    AUDIO_RECORDING, //Record voice messages
    ACOUSTIC_EVENT_DETECTION, //Sense users’ health using microphone
    ACOUSTIC_COMMUNICATION, //Decode audios to receive messages
    MUSIC, //Record songs
    OTHER_PURPOSES,
    UNKNOWN
}