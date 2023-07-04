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

/** Permissions resource type. */
@JsonSerialize(using = PermissionsType.PermissionsTypeSerializer.class)
public class PermissionsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("permissions"));

  public static final PermissionsType PERMISSIONS = new PermissionsType("permissions");

  PermissionsType(String value) {
    super(value, allowedValues);
  }

  public static class PermissionsTypeSerializer extends StdSerializer<PermissionsType> {
    public PermissionsTypeSerializer(Class<PermissionsType> t) {
      super(t);
    }

    public PermissionsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(PermissionsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PermissionsType fromValue(String value) {
    return new PermissionsType(value);
  }
}
