/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.v2.client.JSON;
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
 * The status of the response
 */
@JsonSerialize(using = LogsAggregateResponseStatus.LogsAggregateResponseStatusSerializer.class)
public class LogsAggregateResponseStatus {

    public static final LogsAggregateResponseStatus DONE = new LogsAggregateResponseStatus("done");
    public static final LogsAggregateResponseStatus TIMEOUT = new LogsAggregateResponseStatus("timeout");

    private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("done", "timeout"));

    private String value;

    public boolean isValid() {
        return allowedValues.contains(this.value);
    }

    LogsAggregateResponseStatus(String value) {
        this.value = value;
    }

    public static class LogsAggregateResponseStatusSerializer extends StdSerializer<LogsAggregateResponseStatus> {

        public LogsAggregateResponseStatusSerializer(Class<LogsAggregateResponseStatus> t) {
            super(t);
        }

        public LogsAggregateResponseStatusSerializer() {
            this(null);
        }

        @Override
        public void serialize(LogsAggregateResponseStatus value, JsonGenerator jgen, SerializerProvider provider)
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
     * Return true if this LogsAggregateResponseStatus object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.value.equals(((LogsAggregateResponseStatus) o).value);
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
    public static LogsAggregateResponseStatus fromValue(String value) {
        return new LogsAggregateResponseStatus(value);
    }
}
