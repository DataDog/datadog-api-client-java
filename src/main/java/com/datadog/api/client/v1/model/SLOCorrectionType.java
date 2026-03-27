/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** SLO correction resource type. */
@JsonSerialize(using = SLOCorrectionType.SLOCorrectionTypeSerializer.class)
public class SLOCorrectionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("correction"));

  public static final SLOCorrectionType CORRECTION = new SLOCorrectionType("correction");

  SLOCorrectionType(String value) {
    super(value, allowedValues);
  }

  public static class SLOCorrectionTypeSerializer extends StdSerializer<SLOCorrectionType> {
    public SLOCorrectionTypeSerializer(Class<SLOCorrectionType> t) {
      super(t);
    }

    public SLOCorrectionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SLOCorrectionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SLOCorrectionType fromValue(String value) {
    return new SLOCorrectionType(value);
  }
}
