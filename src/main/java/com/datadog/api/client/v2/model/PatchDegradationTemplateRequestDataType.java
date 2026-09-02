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

/** Degradation templates resource type. */
@JsonSerialize(
    using =
        PatchDegradationTemplateRequestDataType.PatchDegradationTemplateRequestDataTypeSerializer
            .class)
public class PatchDegradationTemplateRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("degradation_templates"));

  public static final PatchDegradationTemplateRequestDataType DEGRADATION_TEMPLATES =
      new PatchDegradationTemplateRequestDataType("degradation_templates");

  PatchDegradationTemplateRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class PatchDegradationTemplateRequestDataTypeSerializer
      extends StdSerializer<PatchDegradationTemplateRequestDataType> {
    public PatchDegradationTemplateRequestDataTypeSerializer(
        Class<PatchDegradationTemplateRequestDataType> t) {
      super(t);
    }

    public PatchDegradationTemplateRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PatchDegradationTemplateRequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PatchDegradationTemplateRequestDataType fromValue(String value) {
    return new PatchDegradationTemplateRequestDataType(value);
  }
}
