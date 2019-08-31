package me.tianshili.annotationlib.contacts;

import me.tianshili.annotationlib.contacts.ContactsDataType;
import me.tianshili.annotationlib.contacts.ContactsPurpose;
import me.tianshili.annotationlib.commons.*;

/**
 * Created by tianshi on 4/14/19.
 */

public @interface ContactsSource {
    String ID();
    String [] purpose();
}
