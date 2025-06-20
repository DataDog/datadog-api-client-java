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

/** Type of the Microsoft Sentinel destination. */
@JsonSerialize(
    using =
        CustomDestinationForwardDestinationMicrosoftSentinelType
            .CustomDestinationForwardDestinationMicrosoftSentinelTypeSerializer.class)
public class CustomDestinationForwardDestinationMicrosoftSentinelType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("microsoft_sentinel"));

  public static final CustomDestinationForwardDestinationMicrosoftSentinelType MICROSOFT_SENTINEL =
      new CustomDestinationForwardDestinationMicrosoftSentinelType("microsoft_sentinel");

  CustomDestinationForwardDestinationMicrosoftSentinelType(String value) {
    super(value, allowedValues);
  }

  public static class CustomDestinationForwardDestinationMicrosoftSentinelTypeSerializer
      extends StdSerializer<CustomDestinationForwardDestinationMicrosoftSentinelType> {
    public CustomDestinationForwardDestinationMicrosoftSentinelTypeSerializer(
        Class<CustomDestinationForwardDestinationMicrosoftSentinelType> t) {
      super(t);
    }

    public CustomDestinationForwardDestinationMicrosoftSentinelTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomDestinationForwardDestinationMicrosoftSentinelType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomDestinationForwardDestinationMicrosoftSentinelType fromValue(String value) {
    return new CustomDestinationForwardDestinationMicrosoftSentinelType(value);
  }
}
