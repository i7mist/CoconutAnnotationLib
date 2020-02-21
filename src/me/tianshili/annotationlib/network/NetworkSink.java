package me.tianshili.annotationlib.network;

public @interface NetworkSink {
    String [] dataSourceIDs();
    String rationaleForDataEgress();
    boolean sharedWith3rdParty(); // either right now via this network traffic or in the future from the server end
}
