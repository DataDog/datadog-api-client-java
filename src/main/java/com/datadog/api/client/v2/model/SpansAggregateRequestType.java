/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** The type of resource. The value should always be aggregate_request. */
@JsonSerialize(using = SpansAggregateRequestType.SpansAggregateRequestTypeSerializer.class)
public class SpansAggregateRequestType {

  public static final SpansAggregateRequestType AGGREGATE_REQUEST =
      new SpansAggregateRequestType("aggregate_request");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aggregate_request"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SpansAggregateRequestType(String value) {
    this.value = value;
  }

  public static class SpansAggregateRequestTypeSerializer
      extends StdSerializer<SpansAggregateRequestType> {
    public SpansAggregateRequestTypeSerializer(Class<SpansAggregateRequestType> t) {
      super(t);
    }

    public SpansAggregateRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SpansAggregateRequestType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this SpansAggregateRequestType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SpansAggregateRequestType) o).value);
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
  public static SpansAggregateRequestType fromValue(String value) {
    return new SpansAggregateRequestType(value);
  }
}
