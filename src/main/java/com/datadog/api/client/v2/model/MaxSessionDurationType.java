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

/** Data type of a maximum session duration update. */
@JsonSerialize(using = MaxSessionDurationType.MaxSessionDurationTypeSerializer.class)
public class MaxSessionDurationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("max_session_duration"));

  public static final MaxSessionDurationType MAX_SESSION_DURATION =
      new MaxSessionDurationType("max_session_duration");

  MaxSessionDurationType(String value) {
    super(value, allowedValues);
  }

  public static class MaxSessionDurationTypeSerializer
      extends StdSerializer<MaxSessionDurationType> {
    public MaxSessionDurationTypeSerializer(Class<MaxSessionDurationType> t) {
      super(t);
    }

    public MaxSessionDurationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MaxSessionDurationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MaxSessionDurationType fromValue(String value) {
    return new MaxSessionDurationType(value);
  }
}
