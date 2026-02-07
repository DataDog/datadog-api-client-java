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

/** Type of the resource. */
@JsonSerialize(
    using =
        MaxSessionDurationUpdateRequestDataType.MaxSessionDurationUpdateRequestDataTypeSerializer
            .class)
public class MaxSessionDurationUpdateRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("max_session_duration"));

  public static final MaxSessionDurationUpdateRequestDataType MAX_SESSION_DURATION =
      new MaxSessionDurationUpdateRequestDataType("max_session_duration");

  MaxSessionDurationUpdateRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class MaxSessionDurationUpdateRequestDataTypeSerializer
      extends StdSerializer<MaxSessionDurationUpdateRequestDataType> {
    public MaxSessionDurationUpdateRequestDataTypeSerializer(
        Class<MaxSessionDurationUpdateRequestDataType> t) {
      super(t);
    }

    public MaxSessionDurationUpdateRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MaxSessionDurationUpdateRequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MaxSessionDurationUpdateRequestDataType fromValue(String value) {
    return new MaxSessionDurationUpdateRequestDataType(value);
  }
}
