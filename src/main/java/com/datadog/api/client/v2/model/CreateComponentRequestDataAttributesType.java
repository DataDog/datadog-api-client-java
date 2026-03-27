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

/** The type of the component. */
@JsonSerialize(
    using =
        CreateComponentRequestDataAttributesType.CreateComponentRequestDataAttributesTypeSerializer
            .class)
public class CreateComponentRequestDataAttributesType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("component", "group"));

  public static final CreateComponentRequestDataAttributesType COMPONENT =
      new CreateComponentRequestDataAttributesType("component");
  public static final CreateComponentRequestDataAttributesType GROUP =
      new CreateComponentRequestDataAttributesType("group");

  CreateComponentRequestDataAttributesType(String value) {
    super(value, allowedValues);
  }

  public static class CreateComponentRequestDataAttributesTypeSerializer
      extends StdSerializer<CreateComponentRequestDataAttributesType> {
    public CreateComponentRequestDataAttributesTypeSerializer(
        Class<CreateComponentRequestDataAttributesType> t) {
      super(t);
    }

    public CreateComponentRequestDataAttributesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateComponentRequestDataAttributesType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CreateComponentRequestDataAttributesType fromValue(String value) {
    return new CreateComponentRequestDataAttributesType(value);
  }
}
