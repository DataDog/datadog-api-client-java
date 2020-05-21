package com.datadog.api;

public enum RecordingMode {
    MODE_IGNORE("none"),
    MODE_REPLAYING("false"),
    MODE_RECORDING("true");

    public final String value;

    private RecordingMode(String value) {
        this.value = value;
    }
}
