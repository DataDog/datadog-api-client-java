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

/** The resource type for source map objects. */
@JsonSerialize(using = SourcemapDataType.SourcemapDataTypeSerializer.class)
public class SourcemapDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("sourcemaps"));

  public static final SourcemapDataType SOURCEMAPS = new SourcemapDataType("sourcemaps");

  SourcemapDataType(String value) {
    super(value, allowedValues);
  }

  public static class SourcemapDataTypeSerializer extends StdSerializer<SourcemapDataType> {
    public SourcemapDataTypeSerializer(Class<SourcemapDataType> t) {
      super(t);
    }

    public SourcemapDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SourcemapDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SourcemapDataType fromValue(String value) {
    return new SourcemapDataType(value);
  }
}
