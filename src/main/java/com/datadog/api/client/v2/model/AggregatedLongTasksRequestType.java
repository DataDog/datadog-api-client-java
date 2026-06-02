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

/** The JSON:API type for aggregated long tasks requests. */
@JsonSerialize(
    using = AggregatedLongTasksRequestType.AggregatedLongTasksRequestTypeSerializer.class)
public class AggregatedLongTasksRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aggregated_long_tasks"));

  public static final AggregatedLongTasksRequestType AGGREGATED_LONG_TASKS =
      new AggregatedLongTasksRequestType("aggregated_long_tasks");

  AggregatedLongTasksRequestType(String value) {
    super(value, allowedValues);
  }

  public static class AggregatedLongTasksRequestTypeSerializer
      extends StdSerializer<AggregatedLongTasksRequestType> {
    public AggregatedLongTasksRequestTypeSerializer(Class<AggregatedLongTasksRequestType> t) {
      super(t);
    }

    public AggregatedLongTasksRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AggregatedLongTasksRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AggregatedLongTasksRequestType fromValue(String value) {
    return new AggregatedLongTasksRequestType(value);
  }
}
