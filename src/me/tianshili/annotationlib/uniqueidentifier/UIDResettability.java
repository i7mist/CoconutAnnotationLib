package me.tianshili.annotationlib.uniqueidentifier;

/**
 * Created by tianshi on 1/20/18.
 */

public enum UIDResettability {
    USER_RESETTABLE,
    RESET_WHEN_SESSION_END,
    RESET_WHEN_REINSTALL, // package name and signing key are the same
    RESET_WHEN_FACTORY_RESET,
    PERSIST_AFTER_FACTORY_RESET,
    UNKNOWN
}
