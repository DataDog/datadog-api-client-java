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
        StatusPagesComponentGroupAttributesComponentsItemsType
            .StatusPagesComponentGroupAttributesComponentsItemsTypeSerializer.class)
public class StatusPagesComponentGroupAttributesComponentsItemsType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("component"));

  public static final StatusPagesComponentGroupAttributesComponentsItemsType COMPONENT =
      new StatusPagesComponentGroupAttributesComponentsItemsType("component");

  StatusPagesComponentGroupAttributesComponentsItemsType(String value) {
    super(value, allowedValues);
  }

  public static class StatusPagesComponentGroupAttributesComponentsItemsTypeSerializer
      extends StdSerializer<StatusPagesComponentGroupAttributesComponentsItemsType> {
    public StatusPagesComponentGroupAttributesComponentsItemsTypeSerializer(
        Class<StatusPagesComponentGroupAttributesComponentsItemsType> t) {
      super(t);
    }

    public StatusPagesComponentGroupAttributesComponentsItemsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        StatusPagesComponentGroupAttributesComponentsItemsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static StatusPagesComponentGroupAttributesComponentsItemsType fromValue(String value) {
    return new StatusPagesComponentGroupAttributesComponentsItemsType(value);
  }
}
