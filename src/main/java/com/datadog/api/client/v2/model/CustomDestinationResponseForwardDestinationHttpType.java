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

/** Type of the HTTP destination. */
@JsonSerialize(
    using =
        CustomDestinationResponseForwardDestinationHttpType
            .CustomDestinationResponseForwardDestinationHttpTypeSerializer.class)
public class CustomDestinationResponseForwardDestinationHttpType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("http"));

  public static final CustomDestinationResponseForwardDestinationHttpType HTTP =
      new CustomDestinationResponseForwardDestinationHttpType("http");

  CustomDestinationResponseForwardDestinationHttpType(String value) {
    super(value, allowedValues);
  }

  public static class CustomDestinationResponseForwardDestinationHttpTypeSerializer
      extends StdSerializer<CustomDestinationResponseForwardDestinationHttpType> {
    public CustomDestinationResponseForwardDestinationHttpTypeSerializer(
        Class<CustomDestinationResponseForwardDestinationHttpType> t) {
      super(t);
    }

    public CustomDestinationResponseForwardDestinationHttpTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomDestinationResponseForwardDestinationHttpType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomDestinationResponseForwardDestinationHttpType fromValue(String value) {
    return new CustomDestinationResponseForwardDestinationHttpType(value);
  }
}
