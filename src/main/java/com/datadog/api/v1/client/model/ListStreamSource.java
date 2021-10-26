/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.datadog.api.v1.client.JSON;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.swagger.annotations.ApiModel;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Source from which to query items to display in the stream.
 */
@JsonSerialize(using = ListStreamSource.ListStreamSourceSerializer.class)
public class ListStreamSource {

    public static final ListStreamSource ISSUE_STREAM = new ListStreamSource("issue_stream");
    public static final ListStreamSource LOGS_STREAM = new ListStreamSource("logs_stream");
    public static final ListStreamSource AUDIT_STREAM = new ListStreamSource("audit_stream");

    private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("issue_stream", "logs_stream", "audit_stream"));

    private String value;

    public boolean isValid() {
        return allowedValues.contains(this.value);
    }

    ListStreamSource(String value) {
        this.value = value;
    }

    public static class ListStreamSourceSerializer extends StdSerializer<ListStreamSource> {

        public ListStreamSourceSerializer(Class<ListStreamSource> t) {
            super(t);
        }

        public ListStreamSourceSerializer() {
            this(null);
        }

        @Override
        public void serialize(ListStreamSource value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
            jgen.writeObject(value.value);
        }
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Return true if this ListStreamSource object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.value.equals(((ListStreamSource) o).value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ListStreamSource fromValue(String value) {
        return new ListStreamSource(value);
    }
}
