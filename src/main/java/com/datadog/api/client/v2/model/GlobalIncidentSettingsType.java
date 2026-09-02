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

/** Global incident settings resource type */
@JsonSerialize(using = GlobalIncidentSettingsType.GlobalIncidentSettingsTypeSerializer.class)
public class GlobalIncidentSettingsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("incidents_global_settings"));

  public static final GlobalIncidentSettingsType INCIDENTS_GLOBAL_SETTINGS =
      new GlobalIncidentSettingsType("incidents_global_settings");

  GlobalIncidentSettingsType(String value) {
    super(value, allowedValues);
  }

  public static class GlobalIncidentSettingsTypeSerializer
      extends StdSerializer<GlobalIncidentSettingsType> {
    public GlobalIncidentSettingsTypeSerializer(Class<GlobalIncidentSettingsType> t) {
      super(t);
    }

    public GlobalIncidentSettingsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GlobalIncidentSettingsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GlobalIncidentSettingsType fromValue(String value) {
    return new GlobalIncidentSettingsType(value);
  }
}
