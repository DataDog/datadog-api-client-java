/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using = StructuredAnalysisCastTargetType.StructuredAnalysisCastTargetTypeSerializer.class)
public class StructuredAnalysisCastTargetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("string", "int64", "float64", "timestamp"));

  public static final StructuredAnalysisCastTargetType STRING =
      new StructuredAnalysisCastTargetType("string");
  public static final StructuredAnalysisCastTargetType INT64 =
      new StructuredAnalysisCastTargetType("int64");
  public static final StructuredAnalysisCastTargetType FLOAT64 =
      new StructuredAnalysisCastTargetType("float64");
  public static final StructuredAnalysisCastTargetType TIMESTAMP =
      new StructuredAnalysisCastTargetType("timestamp");

  StructuredAnalysisCastTargetType(String value) {
    super(value, allowedValues);
  }

  public static class StructuredAnalysisCastTargetTypeSerializer
      extends StdSerializer<StructuredAnalysisCastTargetType> {
    public StructuredAnalysisCastTargetTypeSerializer(Class<StructuredAnalysisCastTargetType> t) {
      super(t);
    }

    public StructuredAnalysisCastTargetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        StructuredAnalysisCastTargetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static StructuredAnalysisCastTargetType fromValue(String value) {
    return new StructuredAnalysisCastTargetType(value);
  }
}
