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

/**
 * The type of the ownership settings resource. The value should always be <code>ownership_settings
 * </code>.
 */
@JsonSerialize(using = OwnershipSettingsType.OwnershipSettingsTypeSerializer.class)
public class OwnershipSettingsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ownership_settings"));

  public static final OwnershipSettingsType OWNERSHIP_SETTINGS =
      new OwnershipSettingsType("ownership_settings");

  OwnershipSettingsType(String value) {
    super(value, allowedValues);
  }

  public static class OwnershipSettingsTypeSerializer extends StdSerializer<OwnershipSettingsType> {
    public OwnershipSettingsTypeSerializer(Class<OwnershipSettingsType> t) {
      super(t);
    }

    public OwnershipSettingsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OwnershipSettingsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OwnershipSettingsType fromValue(String value) {
    return new OwnershipSettingsType(value);
  }
}
