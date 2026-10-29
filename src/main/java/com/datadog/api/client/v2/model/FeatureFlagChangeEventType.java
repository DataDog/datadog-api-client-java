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

/** The resource type. */
@JsonSerialize(using = FeatureFlagChangeEventType.FeatureFlagChangeEventTypeSerializer.class)
public class FeatureFlagChangeEventType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("change-events"));

  public static final FeatureFlagChangeEventType CHANGE_EVENTS =
      new FeatureFlagChangeEventType("change-events");

  FeatureFlagChangeEventType(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagChangeEventTypeSerializer
      extends StdSerializer<FeatureFlagChangeEventType> {
    public FeatureFlagChangeEventTypeSerializer(Class<FeatureFlagChangeEventType> t) {
      super(t);
    }

    public FeatureFlagChangeEventTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagChangeEventType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagChangeEventType fromValue(String value) {
    return new FeatureFlagChangeEventType(value);
  }
}
