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

/** Maintenance templates resource type. */
@JsonSerialize(
    using =
        PatchMaintenanceTemplateRequestDataType.PatchMaintenanceTemplateRequestDataTypeSerializer
            .class)
public class PatchMaintenanceTemplateRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("maintenance_templates"));

  public static final PatchMaintenanceTemplateRequestDataType MAINTENANCE_TEMPLATES =
      new PatchMaintenanceTemplateRequestDataType("maintenance_templates");

  PatchMaintenanceTemplateRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class PatchMaintenanceTemplateRequestDataTypeSerializer
      extends StdSerializer<PatchMaintenanceTemplateRequestDataType> {
    public PatchMaintenanceTemplateRequestDataTypeSerializer(
        Class<PatchMaintenanceTemplateRequestDataType> t) {
      super(t);
    }

    public PatchMaintenanceTemplateRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PatchMaintenanceTemplateRequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PatchMaintenanceTemplateRequestDataType fromValue(String value) {
    return new PatchMaintenanceTemplateRequestDataType(value);
  }
}
