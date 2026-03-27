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

/** Type of container. */
@JsonSerialize(using = ContainerType.ContainerTypeSerializer.class)
public class ContainerType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("container"));

  public static final ContainerType CONTAINER = new ContainerType("container");

  ContainerType(String value) {
    super(value, allowedValues);
  }

  public static class ContainerTypeSerializer extends StdSerializer<ContainerType> {
    public ContainerTypeSerializer(Class<ContainerType> t) {
      super(t);
    }

    public ContainerTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ContainerType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ContainerType fromValue(String value) {
    return new ContainerType(value);
  }
}
