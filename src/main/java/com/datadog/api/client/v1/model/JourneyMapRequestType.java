/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Request type for the Journey Paths widget. */
@JsonSerialize(using = JourneyMapRequestType.JourneyMapRequestTypeSerializer.class)
public class JourneyMapRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("journey_map"));

  public static final JourneyMapRequestType JOURNEY_MAP = new JourneyMapRequestType("journey_map");

  JourneyMapRequestType(String value) {
    super(value, allowedValues);
  }

  public static class JourneyMapRequestTypeSerializer extends StdSerializer<JourneyMapRequestType> {
    public JourneyMapRequestTypeSerializer(Class<JourneyMapRequestType> t) {
      super(t);
    }

    public JourneyMapRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        JourneyMapRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static JourneyMapRequestType fromValue(String value) {
    return new JourneyMapRequestType(value);
  }
}
