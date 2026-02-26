/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** The type of resource. The value should always be aggregate_request. */
@JsonSerialize(using = SpansAggregateRequestType.SpansAggregateRequestTypeSerializer.class)
public class SpansAggregateRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aggregate_request"));

  public static final SpansAggregateRequestType AGGREGATE_REQUEST =
      new SpansAggregateRequestType("aggregate_request");

  SpansAggregateRequestType(String value) {
    super(value, allowedValues);
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

  @JsonCreator
  public static SpansAggregateRequestType fromValue(String value) {
    return new SpansAggregateRequestType(value);
  }
}
