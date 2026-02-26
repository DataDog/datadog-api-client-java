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

/** Type of container group. */
@JsonSerialize(using = ContainerGroupType.ContainerGroupTypeSerializer.class)
public class ContainerGroupType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("container_group"));

  public static final ContainerGroupType CONTAINER_GROUP =
      new ContainerGroupType("container_group");

  ContainerGroupType(String value) {
    super(value, allowedValues);
  }

  public static class ContainerGroupTypeSerializer extends StdSerializer<ContainerGroupType> {
    public ContainerGroupTypeSerializer(Class<ContainerGroupType> t) {
      super(t);
    }

    public ContainerGroupTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ContainerGroupType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ContainerGroupType fromValue(String value) {
    return new ContainerGroupType(value);
  }
}
